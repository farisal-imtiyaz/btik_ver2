package com.example.btik.resi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.btik.dashboard.Dashboard
import com.example.btik.databinding.ActivityNoresiBinding

class ResiActivity: AppCompatActivity() {
    private lateinit var binding : ActivityNoresiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoresiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener {
            finishAffinity()
            startActivity(Intent(this@ResiActivity, Dashboard::class.java))
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
        startActivity(Intent(this@ResiActivity, Dashboard::class.java))
    }
}