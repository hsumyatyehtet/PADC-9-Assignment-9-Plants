package com.padcmyanmar.padc9plantassignment9.holder

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.delegate.PlantDelegate
import kotlinx.android.synthetic.main.main_rv_item.view.*

class PlantRvViewHolder(itemView: View, private val plantDelegate: PlantDelegate) :
    BaseViewHolder<PlantVO>(itemView) {

    init {
        itemView.setOnClickListener {
            //plantDelegate.onTapDelegat()
            val id = data?.plantId

            data?.plantId?.let { id ->
                plantDelegate.onTapDelegat(id)
            }
        }
    }

    override fun bindData(data: PlantVO) {
        itemView.tv_title.text = data.plantName
        itemView.tv_profile_name.text = data.uploadedUser.name

        Glide.with(itemView)
            .load(data.uploadedUser.userPhoto)
            .into(itemView.iv_profile)

        Glide.with(itemView)
            .load(data.plantPhoto)
            .into(itemView.iv_plant_photo)
    }

}