package com.example.remember_lizzy


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.remember_lizzy.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_main) as NavHostFragment
        val navController = navHostFragment.navController

        navController.addOnDestinationChangedListener { _, navDestination, _ ->
            Handler(Looper.getMainLooper()).post {
                when (navDestination.id) {
                    R.id.homeFragment, R.id.detailtimFragment, R.id.taskFragment, R.id.profileFragment , R.id.detailFragment-> {
                        binding.bottomNavMain.visibility = View.VISIBLE
                    }
                    else -> {
                        binding.bottomNavMain.visibility = View.GONE
                    }
                }
            }
        }

        binding.bottomNavMain.setupWithNavController(navController)
    }







}