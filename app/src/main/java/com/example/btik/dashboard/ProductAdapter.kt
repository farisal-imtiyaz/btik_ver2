package com.example.btik.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.btik.R
import com.example.btik.databinding.ItemListBarangBinding
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class ProductAdapter(var productList: ArrayList<DataBarang>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    var onItemClick: ((DataBarang) -> Unit)? = null


    inner class ProductViewHolder(var v :ItemListBarangBinding) : RecyclerView.ViewHolder(v.root){
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(productList[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<ItemListBarangBinding>(
            inflter, R.layout.item_list_barang,parent, false)
        return ProductViewHolder(v)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.v.isProduct = productList[position]
        holder.v.ProductImg.loadImage(productList[position].imgBarang, null)
        holder.v.ProductInfo.text = productList[position].hargaBarang.toString().toCurrencyFormat()
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    private fun String.toCurrencyFormat(): String {
        val localeID = Locale("in", "ID")
        val doubleValue = this.toDoubleOrNull() ?: return this
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        numberFormat.minimumFractionDigits = 0
        return numberFormat.format(doubleValue)
    }
}