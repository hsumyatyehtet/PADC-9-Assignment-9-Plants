package com.padcmyanmar.padc9plantassignment9.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "plants_login")
data class PlantsLoginVO (

    @PrimaryKey
    @SerializedName("user_id")
    @ColumnInfo(name = "user_id")
    var userId: String,

    @SerializedName("user_name")
    @ColumnInfo(name = "user_name")
    var userName: String,

    @SerializedName("user_photo_url")
    @ColumnInfo(name = "user_photo_url")
    var userPhotoUrl: String,

    @SerializedName("member_since")
    @ColumnInfo(name = "member_since")
    var memberSince: String,

    @SerializedName("member_rank")
    @ColumnInfo(name = "member_rank")
    var memberRank: String
)