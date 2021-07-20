package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class İnfo(
    @SerialName("page")
    val page: Int? = null,
    @SerialName("results")
    val results: Int? = null,
    @SerialName("seed")
    val seed: String? = null,
    @SerialName("version")
    val version: String? = null
)