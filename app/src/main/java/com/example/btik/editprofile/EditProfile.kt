package com.example.btik.editprofile

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.btik.databinding.ActivityEditProfileBinding
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth


class EditProfile : AppCompatActivity() {

    private lateinit var binding : ActivityEditProfileBinding
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }
    private var imageData : Uri? = null
    var user = FirebaseAuth.getInstance().currentUser


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkPreference()
        initView()
    }

    private fun initView(){
        binding.apply {
            backEdtProfile.setOnClickListener {
                finish()
            }
            btnSaveProfile.setOnClickListener {
                preferenceHelper.apply {
                    setEmail(etEmail.text.toString())
                    setUsername(etUsername.text.toString())
                    setPhoneNumber(etPhoneNumber.text.toString())
                    setProfilePicture(imageData.toString())
                }


                if (etEmail.text.toString() != user?.email){
                    user?.updateEmail(etEmail.getText().toString())
                        ?.addOnCompleteListener(OnCompleteListener<Void?> { task ->
                            if (task.isSuccessful) {
                                //Do nothing
                            }
                        })
                }
                Toast.makeText(this@EditProfile, "Updated", Toast.LENGTH_SHORT)
                    .show()
            }
            tvChangePicture.setOnClickListener {
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
        }
    }

    private fun checkPreference(){
        binding.apply {
            if (preferenceHelper.getEmail().isNotEmpty()) etEmail.setText(preferenceHelper.getEmail())
            if (preferenceHelper.getUsername().isNotEmpty()) etUsername.setText(preferenceHelper.getUsername())
            if (preferenceHelper.getPhoneNumber().isNotEmpty()) etPhoneNumber.setText(preferenceHelper.getPhoneNumber())
            if (preferenceHelper.getProfilePicture().isNotEmpty()) profileImage2.setImageURI(preferenceHelper.getProfilePicture().toUri())
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
            binding.profileImage2.setImageURI(data?.data)
            imageData = data?.data
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
    }
}