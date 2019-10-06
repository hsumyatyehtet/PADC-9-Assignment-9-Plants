package com.padcmyanmar.padc9plantassignment9.mvp.views

import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO

interface PlantDetailView: BaseView {

    fun displayPlantData(plantData: PlantVO)
}