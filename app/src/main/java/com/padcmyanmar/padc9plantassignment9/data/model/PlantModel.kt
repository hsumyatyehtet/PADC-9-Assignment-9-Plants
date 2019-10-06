package com.padcmyanmar.padc9plantassignment9.data.model

import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO

interface PlantModel {

    fun getPlant(
        onSuccess: (List<PlantVO>) -> Unit,
        onFailure: (String) -> Unit
    )

    fun getPlantById(plantId: String): PlantVO
}