package com.example.btik.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.btik.R
import com.example.btik.checkout.CheckoutActivity
import com.example.btik.databinding.ProductViewBinding
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager
import java.text.NumberFormat
import java.util.*

class ProductViewActivity : AppCompatActivity() {
    private lateinit var binding : ProductViewBinding
    private var data: DataBarang? = null
    var totalItem : Int = 1
    var selectedSize : String = ""
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }
    private val ITEM_NAME_CHECKOUT = "item_name_checkout"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProductViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        data = intent.getParcelableExtra("data_barang")
        initView()
    }

    private fun initView(){
        binding.apply {
            if (data != null) {
                isData = data
                ivProduct.loadImage(data?.imgBarang ?: "", null)
                tvPrice.text = data?.hargaBarang.toString().toCurrencyFormat()
            }

            btnPlusItem.setOnClickListener {
                totalItem++
                tvTotalItem.text = totalItem.toString()
            }

            btnMinItem.setOnClickListener {
                totalItem--
                tvTotalItem.text = totalItem.toString()
            }
            initButtonSize()

            back.setOnClickListener {
                finish()
            }

            btnBuy.setOnClickListener {
                if (preferenceHelper.getItemName().isEmpty()){
                    preferenceHelper.setItemName(data?.namaBarang ?: "")
                }else{
                    preferenceHelper.clearSpecificPrefs(ITEM_NAME_CHECKOUT)
                    preferenceHelper.setItemName(data?.namaBarang ?: "")
                }
                val intentData = Intent(this@ProductViewActivity, CheckoutActivity::class.java)
                intentData.putExtra("total_item", binding.tvTotalItem.text.toString().toInt())
                startActivity(intentData)
            }
        }
    }

    private fun String.toCurrencyFormat(): String {
        val localeID = Locale("in", "ID")
        val doubleValue = this.toDoubleOrNull() ?: return this
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        numberFormat.minimumFractionDigits = 0
        return numberFormat.format(doubleValue)
    }

    private fun initButtonSize(){
        binding.apply {
            btnSizeSmall.setOnClickListener {
                btnSizeSmall.setBackgroundResource(R.drawable.custom_button_barang)
                btnSizeMedium.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeDoubleExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                selectedSize = btnSizeSmall.text.toString()
            }

            btnSizeMedium.setOnClickListener {
                btnSizeSmall.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeMedium.setBackgroundResource(R.drawable.custom_button_barang)
                btnSizeLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeDoubleExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                selectedSize = btnSizeMedium.text.toString()
            }

            btnSizeLarge.setOnClickListener {
                btnSizeSmall.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeMedium.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeLarge.setBackgroundResource(R.drawable.custom_button_barang)
                btnSizeExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeDoubleExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                selectedSize = btnSizeLarge.text.toString()
            }

            btnSizeExtraLarge.setOnClickListener {
                btnSizeSmall.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeMedium.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeExtraLarge.setBackgroundResource(R.drawable.custom_button_barang)
                btnSizeDoubleExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                selectedSize = btnSizeExtraLarge.text.toString()
            }

            btnSizeDoubleExtraLarge.setOnClickListener {
                btnSizeSmall.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeMedium.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeExtraLarge.setBackgroundResource(R.drawable.custom_button_size)
                btnSizeDoubleExtraLarge.setBackgroundResource(R.drawable.custom_button_barang)
                selectedSize = btnSizeDoubleExtraLarge.text.toString()
            }
        }
    }
}