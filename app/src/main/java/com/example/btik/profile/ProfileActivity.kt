package com.example.btik.profile

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.lifecycle.lifecycleScope
import com.example.btik.dashboard.Dashboard
import com.example.btik.databinding.ActivityProfileBinding
import com.example.btik.db.DataBarangDatabase
import com.example.btik.deliveryaddress.AddressActivity
import com.example.btik.editprofile.EditProfile
import com.example.btik.login.LoginActivity
import com.example.btik.order.OrderActivity
import com.example.btik.dashboard.ProductViewActivity
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProfileActivity: AppCompatActivity() {

    private lateinit var binding : ActivityProfileBinding
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }
    private val db by lazy { DataBarangDatabase.getDatabase(this).dataBarangDao() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        checkPreference()
        initView()
    }

    private fun initView(){
        binding.apply {
            teksProfil.setOnClickListener {
                startActivity(Intent(this@ProfileActivity, EditProfile::class.java))
            }

            teksDelivery.setOnClickListener {
                startActivity(Intent(this@ProfileActivity, AddressActivity::class.java))
            }

            teksOrder.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,OrderActivity::class.java))
            }

            arrow1.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,EditProfile::class.java))
            }

            arrow2.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,AddressActivity::class.java))
            }

            arrow3.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,OrderActivity::class.java))
            }

            gambar1.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,EditProfile::class.java))
            }

            gambar2.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,AddressActivity::class.java))
            }

            gambar3.setOnClickListener {
                startActivity(Intent(this@ProfileActivity,OrderActivity::class.java))
            }


            back.setOnClickListener{
                startActivity(Intent(this@ProfileActivity,Dashboard::class.java))
            }

            btnLogOut.setOnClickListener {
                lifecycleScope.launch(Dispatchers.IO){
                    db.deleteData()
                    preferenceHelper.clearPrefs()
                    startActivity(Intent(this@ProfileActivity,LoginActivity::class.java))
                    finishAffinity()
                }
            }
        }
    }
    private fun checkPreference(){
        binding.apply {
            if (preferenceHelper.getEmail().isNotEmpty()) email.setText(preferenceHelper.getEmail())
            if (preferenceHelper.getProfilePicture().isNotEmpty()) profileImage.setImageURI(preferenceHelper.getProfilePicture().toUri())
            if (preferenceHelper.getUsername().isNotEmpty()) nama.setText(preferenceHelper.getUsername())
        }
    }

    override fun onResume() {
        super.onResume()
        checkPreference()
    }

}