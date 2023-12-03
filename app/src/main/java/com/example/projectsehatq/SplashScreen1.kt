package com.example.projectsehatq

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class SplashScreen1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen1)

        val btnNext:ImageButton = findViewById(R.id.btnNext)
        val tvNext:TextView = findViewById(R.id.tvNext)

        btnNext.setOnClickListener {
            val intent = Intent(this, SplashScreen2::class.java)
            startActivity(intent)
        }

        tvNext.setOnClickListener {
            val intent = Intent(this, SplashScreen2::class.java)
            startActivity(intent)
        }
    }
}