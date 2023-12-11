package com.example.remember_lizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SelamatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selamat)

        val btnLogin : Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            val ab = Intent(this@SelamatActivity, LoginActivity::class.java)
            startActivity(ab)
        }
    }
}