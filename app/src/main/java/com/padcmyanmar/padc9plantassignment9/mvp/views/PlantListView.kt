package com.padcmyanmar.padc9plantassignment9.mvp.views

import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO

interface PlantListView: BaseView {

    fun displayPlantList(plantList: List<PlantVO>)
    fun displayError(errorMessage: String)
    fun navigationTodetail(plantId: String)
}