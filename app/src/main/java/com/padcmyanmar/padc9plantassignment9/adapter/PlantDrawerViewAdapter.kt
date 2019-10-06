package com.padcmyanmar.padc9plantassignment9.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padc9plantassignment9.R
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.holder.PlantDrawerViewHolder

class PlantDrawerViewAdapter: BaseAdapter<PlantDrawerViewHolder,PlantVO>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantDrawerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.drawer_layout_rv_item, parent, false)
        return PlantDrawerViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: PlantDrawerViewHolder, position: Int) {

    }
}