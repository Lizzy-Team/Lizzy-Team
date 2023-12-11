package com.example.remember_lizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Onboarding3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)
        supportActionBar?.hide()

        val btnNext: Button = findViewById(R.id.btn_lanjut3)
        btnNext.setOnClickListener {
            val ab = Intent(this@Onboarding3Activity, LoginActivity::class.java)
            startActivity(ab)
        }

        val btnLewati : Button = findViewById(R.id.btn_skip3)
        btnLewati.setOnClickListener{
            val ba = Intent(this@Onboarding3Activity, LoginActivity::class.java)
            startActivity(ba)
        }
    }
}
