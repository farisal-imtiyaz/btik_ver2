package com.example.btik.verifivation

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.btik.confirm.ConfirmActivity
import com.example.btik.databinding.ActivityVerificationBinding
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager


class VerificationActivity : AppCompatActivity() {

    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }

    private lateinit var binding : ActivityVerificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        binding.apply {
            back.setOnClickListener {
                finish()
            }
            ivUpload.setOnClickListener {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                        val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                        requestPermissions(permissions, PERMISSION_CODE)
                    } else{
                        chooseImageGallery();
                    }
                }else{
                    chooseImageGallery();
                }
            }
            btnSubmit.setOnClickListener {
                preferenceHelper.clearSpecificPrefs(ITEM_NAME_CHECKOUT)
                startActivity(Intent(this@VerificationActivity, ConfirmActivity::class.java))
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            PERMISSION_CODE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    chooseImageGallery()
                }else{
                    Toast.makeText(this,"Permission denied", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == IMAGE_CHOOSE && resultCode == Activity.RESULT_OK){
            binding.ivUpload.setImageURI(data?.data)
        }
    }

    private fun chooseImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_CHOOSE)
    }

    companion object {
        private val IMAGE_CHOOSE = 1000;
        private val PERMISSION_CODE = 1001;
        private val ITEM_NAME_CHECKOUT = "item_name_checkout"
    }
}