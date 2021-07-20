package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Street(
    @SerialName("name")
    val name: String? = null,
    @SerialName("number")
    val number: Int? = null
)