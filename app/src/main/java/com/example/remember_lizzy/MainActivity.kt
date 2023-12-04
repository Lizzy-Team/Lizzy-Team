package com.example.remember_lizzy


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.remember_lizzy.databinding.ActivityMainBinding
<<<<<<< HEAD
import com.example.remember_lizzy.ui.detailteam.adapter.popFragment
=======
import com.google.android.material.floatingactionbutton.FloatingActionButton
>>>>>>> 1b2879c18d1dfd3648e9539f947f6679b2b28b16


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_main) as NavHostFragment
        val navController = navHostFragment.navController

        binding.btnScan.setOnClickListener{replace(popFragment())}


        navController.addOnDestinationChangedListener { _, navDestination, _ ->
            Handler(Looper.getMainLooper()).post {
                when (navDestination.id) {
                    R.id.homeFragment, R.id.detailtimFragment, R.id.taskFragment, R.id.profileFragment , R.id.detailFragment-> {
                        binding.bottomNavMain.visibility = View.VISIBLE
                    }
                    else -> {
                        binding.bottomNavMain.visibility = View.VISIBLE
                    }
                }
            }
        }

        val btnScan: FloatingActionButton = findViewById(R.id.btn_scan)
        btnScan.setOnClickListener {
            // Ketika FloatingActionButton diklik, buka MemoActivity
            val intent = Intent(this, MemoActivity::class.java)
            startActivity(intent)
        }



        binding.bottomNavMain.setupWithNavController(navController)

    }


    private fun replace(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val  fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.popup, fragment)
        fragmentTransaction.commit()
    }




}