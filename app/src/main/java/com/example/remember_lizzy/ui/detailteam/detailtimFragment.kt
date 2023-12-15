package com.example.remember_lizzy.ui.detailteam

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.remember_lizzy.R
import com.example.remember_lizzy.databinding.FragmentDetailtimBinding
import com.example.remember_lizzy.interfaces.ApiRetrofit
import com.example.remember_lizzy.model.detailtimModel
import com.example.remember_lizzy.ui.detailteam.adapter.DetailTimAdapter
import com.example.remember_lizzy.ui.detailteam.detail.AddTeamActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class detailtimFragment : Fragment() {
    private var _binding : FragmentDetailtimBinding?=null
    private val binding get() = _binding
    private lateinit var detailTimAdapter: DetailTimAdapter
    private var list = ArrayList<detailtimModel.Data>()
    private val api by lazy { ApiRetrofit().endpoint }
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
       onStart()
        onclikck()

    }

    private fun onclikck() {
        binding?.btnAdd?.setOnClickListener{
            pindah()

        }
    }

    private fun pindah() {
        val detailtimFragment = detailtimFragment()
        val fragmentManger = parentFragmentManager
        fragmentManger.beginTransaction().apply {
            replace(
                R.id.nav_host_main,
                detailtimFragment,
                AddTeamActivity::class.java.simpleName
            )
            addToBackStack(null)
            commit()
        }
    }

    override fun onStart() {
        super.onStart()
        getdata()
    }

    private fun getdata(){
        api.data().enqueue(object : Callback<detailtimModel>{
            override fun onResponse(
                call: Call<detailtimModel>,
                response: Response<detailtimModel>
            ) {
                val listResponse = response.body()?.data
                listResponse?.let {
                    list.clear()
                    list.addAll(it)
                    setUpRecyclerView()
                }
            }

            override fun onFailure(call: Call<detailtimModel>, t: Throwable) {
                Log.e("detailtimFragment",t.toString())
            }

        })
    }


    private fun setUpRecyclerView() {


            detailTimAdapter = DetailTimAdapter{list->
            val action = detailtimFragmentDirections.actionDetailtimFragmentToDetailFragment(list)
            findNavController().navigate(action)

        }

        val data = list
        binding?.rvDetailtim?.apply {
            layoutManager = LinearLayoutManager(requireActivity(),
                LinearLayoutManager.VERTICAL,false)
            adapter = detailTimAdapter // ini variabel dari class foodAdapter.
        }
        detailTimAdapter.submitList(data)

    }

}