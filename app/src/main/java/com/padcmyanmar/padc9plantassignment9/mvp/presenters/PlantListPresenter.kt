package com.padcmyanmar.padc9plantassignment9.mvp.presenters

import com.padcmyanmar.padc9plantassignment9.data.model.PlantModelImpl
import com.padcmyanmar.padc9plantassignment9.delegate.PlantDelegate
import com.padcmyanmar.padc9plantassignment9.mvp.views.PlantListView

class PlantListPresenter: BasePresenter<PlantListView>(),PlantDelegate {


    override fun onTapDelegat(plantId: String) {
       mView.navigationTodetail(plantId)
    }

    override fun onCreate() {
        val model: PlantModelImpl = PlantModelImpl
        model.getPlant(
            {plants ->
                mView.displayPlantList(plants)
            },{
                mView.displayError(it)
            }
        )
    }

    override fun onStart() {}
    override fun onResume() {}
    override fun onPause() {}
    override fun onStop() {}
    override fun onDestroy() {}
}