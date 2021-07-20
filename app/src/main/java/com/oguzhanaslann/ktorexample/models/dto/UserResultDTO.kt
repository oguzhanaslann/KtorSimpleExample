package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class UserResultDTO(
    @SerialName("info")
    val info: İnfo? = null,
    @SerialName("results")
    val results: List<Result>? = null
)