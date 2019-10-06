package com.padcmyanmar.padc9plantassignment9.network.dataagents

import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.network.PlantApi
import com.padcmyanmar.padc9plantassignment9.network.response.GetPlantResponse
import com.padcmyanmar.padc9plantassignment9.utils.BASE_URL
import com.padcmyanmar.padc9plantassignment9.utils.EM_NULL_PLANT_RESPONSE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitAgent : PlantDataAgent {

    private val plantApi: PlantApi

    init {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        plantApi = retrofit.create(PlantApi::class.java)
    }


    override fun getPlants(onSuccess: (List<PlantVO>) -> Unit, onFailure: (String) -> Unit) {
        val call = plantApi.getAllPlants()
        call.enqueue(object : Callback<GetPlantResponse> {

            override fun onFailure(call: Call<GetPlantResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<GetPlantResponse>, response: Response<GetPlantResponse>) {
                val plantResponse = response.body()
                if (plantResponse != null) {
                    if (plantResponse.data != null) {
                        onSuccess(plantResponse.data)
                    } else {
                        onFailure(plantResponse.message)
                    }
                } else {
                    onFailure(EM_NULL_PLANT_RESPONSE)
                }
            }

        })
    }
}