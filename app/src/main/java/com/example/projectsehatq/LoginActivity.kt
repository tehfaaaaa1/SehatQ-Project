package com.example.projectsehatq

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnGoogle: Button = findViewById(R.id.googlebtton)
        val btnApple: Button = findViewById(R.id.aplebutn)
        val intent = Intent(this,DashboardActivity::class.java)

        btnGoogle.setOnClickListener {
            startActivity(intent)
            finish()
        }
        btnApple.setOnClickListener {
            startActivity(intent)
            finish()
        }
    }
}