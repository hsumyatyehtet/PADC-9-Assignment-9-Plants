package com.padcmyanmar.padc9plantassignment9.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var data: T?=null
    set(value) {
        field=value

        if (value!=null){
            bindData(value)
        }
    }

    protected abstract fun bindData(data: T)
}