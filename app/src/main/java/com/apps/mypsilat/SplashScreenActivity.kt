package com.apps.mypsilat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 3000)

    }
}