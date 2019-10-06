package com.padcmyanmar.padc9plantassignment9.mvp.presenters

import com.padcmyanmar.padc9plantassignment9.data.model.PlantModelImpl
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.mvp.views.PlantDetailView

class PlantDetailPresenter : BasePresenter<PlantDetailView>() {

    fun onUIReady(plantId: String) {
        if (plantId != null) {
            val model: PlantModelImpl = PlantModelImpl
            val plantVO: PlantVO = model.getPlantById(plantId)
            mView.displayPlantData(plantVO)
        }
    }

    override fun onCreate() {}
    override fun onStart() {}
    override fun onResume() {}
    override fun onPause() {}
    override fun onStop() {}
    override fun onDestroy() {}
}