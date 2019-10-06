package com.padcmyanmar.padc9plantassignment9.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.padc9plantassignment9.data.model.PlantModel
import com.padcmyanmar.padc9plantassignment9.data.model.PlantModelImpl

abstract class BaseActivity: AppCompatActivity() {

    protected lateinit var model: PlantModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model=PlantModelImpl
    }
}