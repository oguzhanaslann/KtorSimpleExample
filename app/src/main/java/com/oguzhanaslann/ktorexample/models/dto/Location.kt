package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Location(
    @SerialName("city")
    val city: String? = null,
    @SerialName("coordinates")
    val coordinates: Coordinates? = null,
    @SerialName("country")
    val country: String? = null,
    @SerialName("postcode")
    val postcode: String? = null,
    @SerialName("state")
    val state: String? = null,
    @SerialName("street")
    val street: Street? = null,
    @SerialName("timezone")
    val timezone: Timezone? = null
)