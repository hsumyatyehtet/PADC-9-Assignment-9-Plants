package com.padcmyanmar.padc9plantassignment9.data.model

import android.content.Context
import com.padcmyanmar.padc9plantassignment9.network.dataagents.RetrofitAgent
import com.padcmyanmar.padc9plantassignment9.persistence.PlantDatabase

abstract class BaseModel {

    protected val dataAgent = RetrofitAgent

    protected lateinit var database: PlantDatabase

    public fun initDatabase(context: Context){
        database= PlantDatabase.getInstance(context)
    }

}