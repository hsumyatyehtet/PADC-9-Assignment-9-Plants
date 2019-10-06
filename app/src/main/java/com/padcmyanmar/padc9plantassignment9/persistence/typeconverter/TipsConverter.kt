package com.padcmyanmar.padc9plantassignment9.persistence.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padc9plantassignment9.data.vos.TipsVO

class TipsConverter {

    @TypeConverter
    fun toString(list: TipsVO): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toList(json: String): TipsVO{
        return Gson().fromJson(json,TipsVO::class.java)
    }
}