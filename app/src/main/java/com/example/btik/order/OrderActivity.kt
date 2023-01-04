package com.example.btik.order

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.btik.dashboard.DataBarang
import com.example.btik.dashboard.ProductAdapter
import com.example.btik.databinding.ActivityOrderBinding
import com.example.btik.db.DataBarangDatabase
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager
import com.google.firebase.database.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class OrderActivity : AppCompatActivity() {
    private var productList: ArrayList<DataBarang> = ArrayList()
    private lateinit var mAdapter: ProductAdapter
    private lateinit var binding : ActivityOrderBinding
    private val db by lazy { DataBarangDatabase.getDatabase(this).dataBarangDao() }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        mAdapter = ProductAdapter(productList)
        binding.apply {
            back.setOnClickListener {
                finish()
            }
            rvProductOrders.layoutManager = LinearLayoutManager(this@OrderActivity)
            rvProductOrders.setHasFixedSize(true)
            rvProductOrders.adapter = mAdapter
        }
        getProductData()
    }

    private fun getProductData(){
        lifecycleScope.launch {
            db.getAllData().collect{
                productList = ArrayList(it)
                mAdapter.notifyDataSetChanged()
                mAdapter.productList = productList
            }
        }
    }
}