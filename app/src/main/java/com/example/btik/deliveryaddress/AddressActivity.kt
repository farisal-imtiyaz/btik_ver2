package com.example.btik.deliveryaddress

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btik.databinding.ActivityAddressBinding
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager

class AddressActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAddressBinding
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkPreference()
        initView()
    }

    private fun initView(){
        binding.apply {
            back.setOnClickListener {
                finish()
            }

            btnSaveAddress.setOnClickListener {
                preferenceHelper.apply {
                    setStreetAddress(street.text.toString())
                    setCityAddress(city.text.toString())
                    setPhoneNumberAddress(noHp.text.toString())
                    setPostalCodeAddress(postalCode.text.toString())
                }

            }
        }
    }

    private fun checkPreference(){
        binding.apply {
            if (preferenceHelper.getStreetAddress().isNotEmpty()) street.setText(preferenceHelper.getStreetAddress())
            if (preferenceHelper.getCityAddress().isNotEmpty()) city.setText(preferenceHelper.getCityAddress())
            if (preferenceHelper.getPhoneNumberAddress().isNotEmpty()) noHp.setText(preferenceHelper.getPhoneNumberAddress())
            if (preferenceHelper.getPostalCodeAddress().isNotEmpty()) postalCode.setText(preferenceHelper.getPostalCodeAddress())
        }
    }
}