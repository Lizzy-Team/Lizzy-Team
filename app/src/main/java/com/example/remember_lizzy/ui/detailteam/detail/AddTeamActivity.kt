package com.example.remember_lizzy.ui.detailteam.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.remember_lizzy.databinding.ActivityAddTeamBinding

class AddTeamActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityAddTeamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}