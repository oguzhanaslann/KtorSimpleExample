package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Name(
    @SerialName("first")
    val first: String? = null,
    @SerialName("last")
    val last: String? = null,
    @SerialName("title")
    val title: String? = null
)