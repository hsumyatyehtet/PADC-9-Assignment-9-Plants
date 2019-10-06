package com.padcmyanmar.padc9plantassignment9.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9plantassignment9.R
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.mvp.presenters.PlantDetailPresenter
import com.padcmyanmar.padc9plantassignment9.mvp.views.PlantDetailView
import kotlinx.android.synthetic.main.plant_detail.*

class PlantDetailActivity : BaseActivity(),PlantDetailView{

    override fun displayPlantData(plantData: PlantVO) {

    }

    private lateinit var mPresenter: PlantDetailPresenter

    companion object {
        const val EXTRA_PLANT_ID: String = "PlantIdExtra"

        fun newIntent(context: Context, plantIdExtra: String): Intent {

            return Intent(context, PlantDetailActivity::class.java).apply {
                putExtra(EXTRA_PLANT_ID, plantIdExtra)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.plant_detail)

        val plantId = intent.getStringExtra(EXTRA_PLANT_ID)

        if (plantId != null) {
            val plantVO = model.getPlantById(plantId)
            bindData(plantVO)
        }
    }

    private fun bindData(plantVO: PlantVO) {
        Glide.with(this)
            .load(plantVO.plantPhoto)
            .into(iv_background_detail)

        tv_title_detail.text = plantVO.plantName
        Glide.with(this)
            .load(plantVO.uploadedUser.userPhoto)
            .into(iv_profile_detail)
        tv_profile_name_detail.text = plantVO.uploadedUser.name
        tv_description.text = plantVO.description

        tv_temperature_data.text = plantVO.tips.temperature
        tv_light_data.text = plantVO.tips.light
        tv_placement_data.text = plantVO.tips.placement
    }
}