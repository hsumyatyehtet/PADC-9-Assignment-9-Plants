package com.padcmyanmar.padc9plantassignment9.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padc9plantassignment9.R
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.delegate.PlantDelegate
import com.padcmyanmar.padc9plantassignment9.holder.PlantRvViewHolder

class PlantAdapter(private val plantDelegate: PlantDelegate) : BaseAdapter<PlantRvViewHolder,PlantVO>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantRvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_rv_item, parent, false)
        return PlantRvViewHolder(view, plantDelegate)
    }
}