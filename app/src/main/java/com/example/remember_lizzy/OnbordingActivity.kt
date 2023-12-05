package com.example.remember_lizzy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OnbordingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbording)
        supportActionBar?.hide()

        val btnNext : Button = findViewById(R.id.btn_lanjut)
        btnNext.setOnClickListener {
            val ab = Intent(this@OnbordingActivity, Onboading2Activity::class.java)
            startActivity(ab)
        }

        val btnLewati : Button = findViewById(R.id.btn_skip)
        btnLewati.setOnClickListener{
            val ba = Intent(this@OnbordingActivity, LoginActivity::class.java)
            startActivity(ba)
        }
    }

}