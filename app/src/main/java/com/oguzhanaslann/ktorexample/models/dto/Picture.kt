package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Picture(
    @SerialName("large")
    val large: String? = null,
    @SerialName("medium")
    val medium: String? = null,
    @SerialName("thumbnail")
    val thumbnail: String? = null
)