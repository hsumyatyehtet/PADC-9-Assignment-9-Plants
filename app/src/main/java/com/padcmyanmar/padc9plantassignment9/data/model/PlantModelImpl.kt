package com.padcmyanmar.padc9plantassignment9.data.model

import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO

object PlantModelImpl : BaseModel(), PlantModel {


    override fun getPlant(onSuccess: (List<PlantVO>) -> Unit, onFailure: (String) -> Unit) {

        val plantFromDB = database.plantDao().getAllPlants()
        if (plantFromDB.isNotEmpty()) {
            onSuccess(plantFromDB)
        } else {
            dataAgent.getPlants(
                {
                    database.plantDao().insertPlants(it)
                    onSuccess(it)
                },onFailure
            )
        }
    }

    override fun getPlantById(plantId: String): PlantVO {
        return database.plantDao().getPlantById(plantId)
    }

}