package com.padcmyanmar.padc9plantassignment9.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tips")
data class TipsVO (

    @SerializedName("temperature")
    @ColumnInfo(name = "temperature")
    var temperature: String,

    @SerializedName("light")
    @ColumnInfo(name = "light")
    var light: String,

    @SerializedName("placement")
    @ColumnInfo(name = "placement")
    var placement: String
)