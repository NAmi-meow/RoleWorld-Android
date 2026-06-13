package com.namimeow.roleworld.network.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.namimeow.roleworld.network.data.AbstractResponse

data class AuthResponse(
    @SerializedName("status")
    @Expose
    val status: Int,

    @SerializedName("statusStr")
    @Expose
    val statusStr: String,

    @SerializedName("nickname")
    @Expose
    val nickname: String,

    @SerializedName("id")
    @Expose
    val id: String
) : AbstractResponse()