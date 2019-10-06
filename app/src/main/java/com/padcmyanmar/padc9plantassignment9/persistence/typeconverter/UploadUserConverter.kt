package com.padcmyanmar.padc9plantassignment9.persistence.typeconverter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padc9plantassignment9.data.vos.UploadUserVO

class UploadUserConverter {

    @TypeConverter
    fun toString(list: UploadUserVO): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toList(json: String): UploadUserVO{
       return Gson().fromJson(json,UploadUserVO::class.java)
    }
}