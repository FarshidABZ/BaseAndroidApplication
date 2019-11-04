package com.farshidabz.androidbaseapplication.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

open class BaseModel : Serializable {
    @Transient
    var statusCode = 200

    var isSuccessful = false

    @SerializedName("reason")
    var apiResponseMessage = ""
}