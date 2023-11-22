package com.example.remember_lizzy.ui.detailteam.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.remember_lizzy.databinding.ItemdetailtimBinding
import com.example.remember_lizzy.model.DetailTim
import com.example.remember_lizzy.utils.Extension.showImageInto
import com.example.remember_lizzy.utils.ExtensionGambarBulat.showImageIntoV2

class DetailTimAdapter() :ListAdapter<DetailTim,DetailTimAdapter.DetailTimViewHolder>(DIFF_CALLBACK) {

    inner class DetailTimViewHolder(private val binding: ItemdetailtimBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(detailTim: DetailTim)
        {
            binding.apply {
                namateam.text = detailTim.name
                ttg.text = detailTim.ttg
                fotodetailteam.showImageInto(itemView.context,detailTim.iconcal)
                progressBar.progress=detailTim.progressbarmin
                taskper.text=detailTim.progressbarmin.toString()+"%"
            }

        }

    }

    companion object{
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<DetailTim>(){
            override fun areItemsTheSame(oldItem: DetailTim, newItem: DetailTim): Boolean =
                oldItem == newItem
            override fun areContentsTheSame(oldItem: DetailTim, newItem: DetailTim): Boolean =
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