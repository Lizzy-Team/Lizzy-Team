package com.example.remember_lizzy.ui.detailteam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.remember_lizzy.data.DataDetailTim
import com.example.remember_lizzy.databinding.FragmentDetailtimBinding
import com.example.remember_lizzy.ui.detailteam.adapter.DetailTimAdapter


class detailtimFragment : Fragment() {
    private var _binding : FragmentDetailtimBinding?=null
    private val binding get() = _binding
    private lateinit var detailTimAdapter: DetailTimAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailtimBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding?.root
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        detailTimAdapter = DetailTimAdapter()
        val detailtimData = DataDetailTim.dummyDetailtim
//        tanpa apply
//        binding?.rvFood?.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.VERTICAL,false)
//        binding?.rvFood?.adapter = foodAdapter
//        pakai apply
        binding?.rvDetailtim?.apply {
            layoutManager = LinearLayoutManager(requireActivity(),
                LinearLayoutManager.VERTICAL,false)
            adapter = detailTimAdapter // ini variabel dari class foodAdapter.
        }
        detailTimAdapter.submitList(detailtimData)
    }

}