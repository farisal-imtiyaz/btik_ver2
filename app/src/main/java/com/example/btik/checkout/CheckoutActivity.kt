package com.example.btik.checkout

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.btik.dashboard.DataBarang
import com.example.btik.dashboard.ProductAdapter
import com.example.btik.databinding.ActivityCheckoutBinding
import com.example.btik.db.DataBarangDatabase
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager
import com.example.btik.verifivation.VerificationActivity
import com.google.firebase.database.*
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class CheckoutActivity : AppCompatActivity() {
    lateinit var mDataBase : DatabaseReference
    private  var productList: ArrayList<DataBarang> = ArrayList()
    private lateinit var mAdapter: ProductAdapter
    private lateinit var binding : ActivityCheckoutBinding
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }
    private var dataBarang: DataBarang = DataBarang()
    var shippingCost = 20000
    private var itemBarang = 0
    private val db by lazy { DataBarangDatabase.getDatabase(this).dataBarangDao() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        itemBarang = intent.getIntExtra("total_item", 0)
        getProductData()
        initView()
    }

    private fun initView(){
        mAdapter = ProductAdapter(productList)
        binding.apply {
            back.setOnClickListener {
                finish()
            }
            rvProductCheckOut.layoutManager = LinearLayoutManager(this@CheckoutActivity)
            rvProductCheckOut.setHasFixedSize(true)
            rvProductCheckOut.adapter = mAdapter

            if (dataBarang.hargaBarang != null){
                val totalCost = dataBarang.hargaBarang.toInt() * itemBarang
                tvPrice.text = totalCost.toString().toCurrencyFormat()
                tvShipping.text = shippingCost.toString().toCurrencyFormat()
                tvTotal.text = (totalCost + shippingCost).toString().toCurrencyFormat()
            }

            btnPay.setOnClickListener {
                lifecycleScope.launch {
                    db.addData(dataBarang)
                }
                startActivity(Intent(this@CheckoutActivity, VerificationActivity::class.java))
            }

            if (preferenceHelper.getCityAddress().isNotEmpty()){
                address.setText(preferenceHelper.getCityAddress())
            }
        }
    }

    private fun getProductData(){
        val query = preferenceHelper.getItemName()
        mDataBase = FirebaseDatabase.getInstance().getReference("Product")
        mDataBase.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for (productSnapshot in snapshot.children){
                        val product = productSnapshot.getValue(DataBarang::class.java)
                        if (product?.namaBarang == query){
                            productList.add(product)
                            dataBarang = product
<<<<<<< HEAD

=======
>>>>>>> 5c5abf55601dec949205ff6de928f56a9be0b8e9
                        }
                    }
                    mAdapter.notifyDataSetChanged()
                    mAdapter.productList = productList
                    initView()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@CheckoutActivity, error.message, Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun String.toCurrencyFormat(): String {
        val localeID = Locale("in", "ID")
        val doubleValue = this.toDoubleOrNull() ?: return this
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        numberFormat.minimumFractionDigits = 0
        return numberFormat.format(doubleValue)
    }
}