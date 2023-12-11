package com.example.remember_lizzy.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.remember_lizzy.EditProfilActivity
import com.example.remember_lizzy.R
import com.example.remember_lizzy.VerifikasiActivity


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Hide the ActionBar of the hosting Activity
        (requireActivity() as AppCompatActivity).supportActionBar?.hide()

        // Get reference to TextView
        val editProfil: TextView = view.findViewById(R.id.textView4)

        // Set click listener to start EditProfilActivity
        editProfil.setOnClickListener {
            val cc = Intent(requireContext(), EditProfilActivity::class.java)
            startActivity(cc)
        }

        return view
    }
}