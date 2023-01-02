package com.example.btik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.btik.dashboard.Dashboard
import com.example.btik.login.LoginActivity
import com.example.btik.util.IPreferenceHelper
import com.example.btik.util.PreferenceManager

class SplashScreenActivity : AppCompatActivity() {
    private val preferenceHelper: IPreferenceHelper by lazy { PreferenceManager(applicationContext) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler(Looper.getMainLooper()).postDelayed({
            if (!preferenceHelper.getIsLogin()) {
                startActivity(Intent(this, LoginActivity::class.java))
            }else{
                startActivity(Intent(this, Dashboard::class.java))
            }
            finish()
        }, 1000)
    }
}

