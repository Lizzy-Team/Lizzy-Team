package com.example.remember_lizzy.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.remember_lizzy.LoginActivity
import com.example.remember_lizzy.Onboading2Activity
import com.example.remember_lizzy.R
import com.example.remember_lizzy.VerifikasiActivity

class DaftarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val btnDaftar : Button = findViewById(R.id.btn_daftar)
        btnDaftar.setOnClickListener {
            val ab = Intent(this@DaftarActivity, VerifikasiActivity::class.java)
            startActivity(ab)
        }

        val Masuk: TextView = findViewById(R.id.masuk)
        Masuk.setOnClickListener {
            val cc = Intent(this@DaftarActivity, LoginActivity::class.java)
            startActivity(cc)
        }
    }
}