package com.example.remember_lizzy.ui.detailteam.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.remember_lizzy.R
import com.example.remember_lizzy.databinding.FragmentDetailBinding
import com.example.remember_lizzy.ui.detailteam.adapter.SectionDetailAdapter
import com.google.android.material.tabs.TabLayoutMediator


class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding?= null
    private val binding get() = _binding
    private val navArgs: DetailFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setuptabview()
        val foodsArgs = navArgs.detailtim
        // isi dengan id = isi dengan data
        binding?.tprofile?.text = foodsArgs.name
    }

    private fun setuptabview() {
        val sectionsDetailAdapter = SectionDetailAdapter(requireActivity())

        binding?.apply {
            viewPager2.adapter = sectionsDetailAdapter

            TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
                tab.text = resources.getString(TAB_TITLES[position])
            }.attach()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.Memo,
            R.string.Task
        )
    }

}