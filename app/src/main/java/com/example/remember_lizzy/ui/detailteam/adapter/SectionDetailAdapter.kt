package com.example.remember_lizzy.ui.detailteam.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.remember_lizzy.ui.detailteam.detailtimFragment
import com.example.remember_lizzy.ui.home.HomeFragment

class SectionDetailAdapter(activity: FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment?= null
        when(position){
            0->fragment = detailtimFragment()
            1->fragment = HomeFragment()
        }
        return fragment as Fragment
    }
}