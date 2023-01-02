package com.example.btik.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.btik.R
import com.example.btik.databinding.ActivityDashboardBinding
import com.example.btik.databinding.ActivityLoginBinding
import com.example.btik.profile.ProfileActivity
import com.google.firebase.database.*

class Dashboard : AppCompatActivity() {

    lateinit var mDataBase : DatabaseReference
    private lateinit var productList: ArrayList<DataBarang>
    private lateinit var mAdapter: ProductAdapter
    private lateinit var binding : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        productList = ArrayList()
        initView()
        getProductData()
        goToProfileMenu()
    }

    private fun getProductData(){
        mDataBase = FirebaseDatabase.getInstance().getReference("Product")
        mDataBase.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                mAdapter.productList.clear()
                if (snapshot.exists()){
                    for (productSnapshot in snapshot.children){
                        val product = productSnapshot.getValue(DataBarang::class.java)
                        productList.add(product!!)
                    }
                    mAdapter.notifyDataSetChanged()
                    mAdapter.productList = productList
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@Dashboard, error.message, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun goToProfileMenu(){
        binding.apply {
            ivMenuProfile.setOnClickListener {
                startActivity(Intent(this@Dashboard, ProfileActivity::class.java))
            }
        }
    }
    private fun initView(){
        mAdapter = ProductAdapter(productList)
        binding.apply {
            recycleProduct.layoutManager = LinearLayoutManager(this@Dashboard)
            recycleProduct.setHasFixedSize(true)
            recycleProduct.adapter = mAdapter

            searchBox.addTextChangedListener(object : TextWatcher {

                override fun afterTextChanged(s: Editable) {
                    if (s.isNotEmpty()){
                        searchProduct(s.toString())
                    }else{
                        getProductData()
                    }
                }

                override fun beforeTextChanged(
                    s: CharSequence, start: Int,
                    count: Int, after: Int
                ) {
                }

                override fun onTextChanged(
                    s: CharSequence, start: Int,
                    before: Int, count: Int
                ) {
                }
            })
        }

        mAdapter.onItemClick = { data ->
            val intentData = Intent(this@Dashboard, ProductViewActivity::class.java )
            intentData.putExtra("data_barang", data)
            startActivity(intentData)
        }


    }

    private fun searchProduct(key : String){
        FirebaseDatabase.getInstance().reference.child("Product").orderByChild("namaBarang").equalTo(key).addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                val productListSearch: ArrayList<DataBarang> = ArrayList()
                if (snapshot.exists()){
                    mAdapter.productList.clear()
                    for (productSnapshot in snapshot.children){
                        val product = productSnapshot.getValue(DataBarang::class.java)
                        productListSearch.add(product!!)
                    }
                    mAdapter.productList = productListSearch
                    mAdapter.notifyDataSetChanged()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

        }
}