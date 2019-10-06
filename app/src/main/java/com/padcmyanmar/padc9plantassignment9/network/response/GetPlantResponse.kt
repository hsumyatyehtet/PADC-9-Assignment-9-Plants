package com.padcmyanmar.padc9plantassignment9.network.response

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.utils.CODE_RESPONSE_OK

data class GetPlantResponse(

    @SerializedName("message")
    val message: String,

    @SerializedName("code")
    val code: Int,

    @SerializedName("data")
    val data: List<PlantVO>
) {
    fun isResponseOk(): Boolean {
        return code == CODE_RESPONSE_OK && data != null
    }
}