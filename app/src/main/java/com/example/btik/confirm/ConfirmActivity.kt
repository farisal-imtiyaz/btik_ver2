package com.example.btik.confirm

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.btik.congrats.CongratsActivity
import com.example.btik.databinding.ActivityConfirmBinding

class ConfirmActivity: AppCompatActivity() {
    private lateinit var binding : ActivityConfirmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfirmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            startActivity(Intent(this@ConfirmActivity, CongratsActivity::class.java))
        }, 3000)
    }
}