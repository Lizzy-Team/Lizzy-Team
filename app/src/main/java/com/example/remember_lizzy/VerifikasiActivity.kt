package com.example.remember_lizzy

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class VerifikasiActivity : AppCompatActivity() {

    private lateinit var verifikasi1 : EditText
    private lateinit var verifikasi2 : EditText
    private lateinit var verifikasi3 : EditText
    private lateinit var verifikasi4 : EditText

    private lateinit var history : TextView

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data : Intent? = result.data
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verifikasi)

        verifikasi1 = findViewById(R.id.kode1)
        verifikasi2 = findViewById(R.id.kode2)
        verifikasi3 = findViewById(R.id.kode3)
        verifikasi4 = findViewById(R.id.kode4)

        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            verifikasi1.setText(bundle.getString("___"))
            verifikasi2.setText(bundle.getString("___"))
            verifikasi3.setText(bundle.getString("___"))
            verifikasi4.setText(bundle.getString("___"))
        }

        val btnVerif: Button = findViewById(R.id.btn_Verif)
        btnVerif.setOnClickListener {
            val aa = Intent(this@VerifikasiActivity, SelamatActivity::class.java)
            startActivity(aa)
        }

        val Ulang: TextView = findViewById(R.id.ulang)
        Ulang.setOnClickListener {
            val cc = Intent(this@VerifikasiActivity, VerifikasiActivity::class.java)
            startActivity(cc)
        }
    }
}