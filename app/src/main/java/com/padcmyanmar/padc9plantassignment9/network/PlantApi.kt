package com.padcmyanmar.padc9plantassignment9.network

import com.padcmyanmar.padc9plantassignment9.network.response.GetPlantResponse
import com.padcmyanmar.padc9plantassignment9.utils.GET_PLANTS

import retrofit2.Call
import retrofit2.http.POST

interface PlantApi {

    @POST(GET_PLANTS)
    fun getAllPlants(): Call<GetPlantResponse>
}