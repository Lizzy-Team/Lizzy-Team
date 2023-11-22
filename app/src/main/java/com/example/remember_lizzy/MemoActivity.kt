package com.example.remember_lizzy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.switchmaterial.SwitchMaterial
import com.google.android.material.textfield.TextInputEditText

class MemoActivity : AppCompatActivity() {
    private lateinit var closeButton: MaterialButton
    private lateinit var titleMemoTextView: MaterialButton
    private lateinit var jdwlTextView: MaterialButton
    private lateinit var shortFormEditText: TextInputEditText
    private lateinit var paragraphFormEditText: TextInputEditText
    private lateinit var ketPriorTextView: MaterialButton
    private lateinit var btnLow: MaterialButton
    private lateinit var btnMed: MaterialButton
    private lateinit var btnHi: MaterialButton
    private lateinit var reminderSwitch: SwitchMaterial
    private lateinit var btnBuat: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)

        closeButton = findViewById(R.id.closeButton)
        titleMemoTextView = findViewById(R.id.titlememo)
        jdwlTextView = findViewById(R.id.jdwl)
        shortFormEditText = findViewById(R.id.shortFormEditText)
        paragraphFormEditText = findViewById(R.id.paragraphFormEditText)
        ketPriorTextView = findViewById(R.id.ket_prior)
        btnLow = findViewById(R.id.btn_low)
        btnMed = findViewById(R.id.btn_med)
        btnHi = findViewById(R.id.btn_hi)
        reminderSwitch = findViewById(R.id.reminderSwitch)
        btnBuat = findViewById(R.id.btn_buat)

        findViewById<View>(R.id.closeButton).setOnClickListener { finish() }

        btnLow.setOnClickListener { onPriorityButtonClick("Rendah") }
        btnMed.setOnClickListener { onPriorityButtonClick("Menengah") }
        btnHi.setOnClickListener { onPriorityButtonClick("Tinggi") }

        btnBuat.setOnClickListener { onSubmitButtonClick() }
    }

    private fun onPriorityButtonClick(priority: String) {
        Toast.makeText(this, "Selected Priority: $priority", Toast.LENGTH_SHORT).show()
    }

    private fun onSubmitButtonClick() {
        val shortFormText = shortFormEditText.text.toString()
        val paragraphFormText = paragraphFormEditText.text.toString()
        val reminderEnabled = reminderSwitch.isChecked

        // Lakukan sesuatu dengan data yang telah diambil
        displayFormData(shortFormText, paragraphFormText, reminderEnabled)
    }

    private fun displayFormData(
        shortFormText: String,
        paragraphFormText: String,
        reminderEnabled: Boolean
    ) {
        // Implementasikan logika untuk menangani data formulir yang diambil
        val message = "Short Form: $shortFormText\nParagraph Form: $paragraphFormText\nReminder Enabled: $reminderEnabled"
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}