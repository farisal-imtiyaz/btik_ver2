package com.example.btik.congrats

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btik.dashboard.Dashboard
import com.example.btik.databinding.CongratsActivityBinding
import com.example.btik.resi.ResiActivity

class CongratsActivity: AppCompatActivity() {
    private lateinit var binding : CongratsActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CongratsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView(){
        binding.apply {
            noResi.setOnClickListener {
                startActivity(Intent(this@CongratsActivity, ResiActivity::class.java))
            }
            backHome.setOnClickListener {
                finishAffinity()
                startActivity(Intent(this@CongratsActivity, Dashboard::class.java))
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
        startActivity(Intent(this@CongratsActivity, Dashboard::class.java))
    }
}