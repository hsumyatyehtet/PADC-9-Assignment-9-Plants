package com.padcmyanmar.padc9plantassignment9.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "upload_user")
data class UploadUserVO (

    @SerializedName("name")
    @ColumnInfo(name = "name")
    var name: String,

    @SerializedName("user_photo")
    @ColumnInfo(name = "user_photo")
    var userPhoto: String,

    @SerializedName("uploaded_time")
    @ColumnInfo(name = "uploaded_time")
    var uploadedTime: String,

    @SerializedName("user_rank")
    @ColumnInfo(name = "user_rank")
    var userRank: String
)