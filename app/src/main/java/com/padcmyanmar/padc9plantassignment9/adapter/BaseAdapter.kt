package com.padcmyanmar.padc9plantassignment9.adapter

import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9plantassignment9.holder.BaseViewHolder

abstract class BaseAdapter<VH : BaseViewHolder<T>, T> : RecyclerView.Adapter<VH>() {

    private var dataList: MutableList<T> = mutableListOf()

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.data = dataList[position]
    }

    fun setNewData(newData: MutableList<T>){
        dataList=newData
        notifyDataSetChanged()
    }
}