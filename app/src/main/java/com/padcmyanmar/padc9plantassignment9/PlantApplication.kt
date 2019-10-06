package com.padcmyanmar.padc9plantassignment9

import android.app.Application
import com.padcmyanmar.padc9plantassignment9.data.model.PlantModelImpl

class PlantApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        PlantModelImpl.initDatabase(applicationContext)
    }
}