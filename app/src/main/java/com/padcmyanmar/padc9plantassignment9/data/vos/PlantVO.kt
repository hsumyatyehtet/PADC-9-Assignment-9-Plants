package com.padcmyanmar.padc9plantassignment9.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "plants")
data class PlantVO (

    @PrimaryKey
    @SerializedName("plant_id")
    @ColumnInfo(name = "plant_id")
    var plantId: String,

    @SerializedName("plant_name")
    @ColumnInfo(name = "plant_name")
    var plantName: String,

    @SerializedName("description")
    @ColumnInfo(name = "description")
    var description: String,

    @SerializedName("top_tip")
    @ColumnInfo(name = "top_tip")
    var topTip: String,

    @SerializedName("tips")
    var tips: TipsVO,

    @SerializedName("uploaded_user")
    var uploadedUser: UploadUserVO,

    @SerializedName("plant_photo")
    @ColumnInfo(name = "plant_photo")
    var plantPhoto: String

)