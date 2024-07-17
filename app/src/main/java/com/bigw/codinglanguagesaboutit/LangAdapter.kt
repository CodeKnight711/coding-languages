package com.bigw.codinglanguagesaboutit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bigw.codinglanguagesaboutit.databinding.ItemBinding

class LangAdapter : RecyclerView.Adapter<LangAdapter.MyViewHolder>() {

    private val data = ArrayList<LangModel>()

    fun setData(data: ArrayList<LangModel>){
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class MyViewHolder(val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bindData(item: LangModel){
            binding.nameLangText.text = item.langName
            binding.langImg.setImageResource(item.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(data[position])
    }

}