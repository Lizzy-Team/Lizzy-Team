package com.example.remember_lizzy.ui.detailteam.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.remember_lizzy.databinding.ItemdetailtimBinding
import com.example.remember_lizzy.model.detailtimModel
import com.example.remember_lizzy.utils.Extension.showImageInto

class DetailTimAdapter(val dataDetailTim: (detailtimModel.Data)->Unit) :ListAdapter<detailtimModel.Data,DetailTimAdapter.DetailTimViewHolder>(DIFF_CALLBACK) {

    inner class DetailTimViewHolder(private val binding: ItemdetailtimBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(detailTim: detailtimModel.Data)

        {

            binding.apply {
                namateam.text = detailTim.nama
                ttg.text = detailTim.ttg
                fotodetailteam.showImageInto(itemView.context,detailTim.iconcal)
                progressBar.progress=detailTim.progressbarmin
                taskper.text=detailTim.progressbarmin.toString()+"%"
                itemView.setOnClickListener{
                    dataDetailTim.invoke(detailTim)
                }
            }


        }

    }

    companion object{
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<detailtimModel.Data>(){
            override fun areItemsTheSame(oldItem: detailtimModel.Data, newItem: detailtimModel.Data): Boolean =
                oldItem == newItem
            override fun areContentsTheSame(oldItem: detailtimModel.Data, newItem: detailtimModel.Data): Boolean =
                oldItem.id == newItem.id

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailTimViewHolder {
        val binding = ItemdetailtimBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return DetailTimViewHolder(binding)

    }


    override fun onBindViewHolder(holder: DetailTimViewHolder, position: Int) {
        holder.bind(getItem(position))
    }






}