package com.example.remember_lizzy

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.FillEventHistory
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.remember_lizzy.ui.DaftarActivity
import com.example.remember_lizzy.ui.home.HomeFragment

class LoginActivity : AppCompatActivity() {
    private lateinit var etusername : EditText
    private lateinit var etpassword : EditText
    private lateinit var history : TextView

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data : Intent? = result.data
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        etusername = findViewById(R.id.edit_email)
        etpassword = findViewById(R.id.edit_sandi)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            etusername.setText(bundle.getString("username"))
            etpassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            val aa = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(aa)
        }

        val btnDaftar: Button = findViewById(R.id.btn_daftar)
        btnDaftar.setOnClickListener {
            val bb = Intent(this@LoginActivity, DaftarActivity::class.java)
            startActivity(bb)
        }

        val lupaSandi: TextView = findViewById(R.id.lupa_sandi)
        lupaSandi.setOnClickListener {
            val cc = Intent(this@LoginActivity, VerifikasiActivity::class.java)
            resultLauncher.launch(cc)
        }

    }

}