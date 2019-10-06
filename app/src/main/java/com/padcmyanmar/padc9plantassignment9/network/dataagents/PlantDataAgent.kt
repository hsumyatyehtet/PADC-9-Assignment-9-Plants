package com.padcmyanmar.padc9plantassignment9.network.dataagents

import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO

interface PlantDataAgent {

    fun getPlants(
        onSuccess: (List<PlantVO>) -> Unit,
        onFailure: (String) -> Unit
    )
}