package com.oguzhanaslann.ktorexample.models.dto


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.annotation.Keep

@Keep
@Serializable
data class Login(
    @SerialName("md5")
    val md5: String? = null,
    @SerialName("password")
    val password: String? = null,
    @SerialName("salt")
    val salt: String? = null,
    @SerialName("sha1")
    val sha1: String? = null,
    @SerialName("sha256")
    val sha256: String? = null,
    @SerialName("username")
    val username: String? = null,
    @SerialName("uuid")
    val uuid: String? = null
)