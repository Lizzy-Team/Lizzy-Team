package com.example.remember_lizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Onboading2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboading2)
        supportActionBar?.hide()

        val btnNext: Button = findViewById(R.id.btn_lanjut2)
        btnNext.setOnClickListener {
            val ab = Intent(this@Onboading2Activity, Onboarding3Activity::class.java)
            startActivity(ab)
        }

        val btnLewati: Button = findViewById(R.id.btn_skip2)
        btnLewati.setOnClickListener {
            val ba = Intent(this@Onboading2Activity, LoginActivity::class.java)
            startActivity(ba)
        }
    }

}