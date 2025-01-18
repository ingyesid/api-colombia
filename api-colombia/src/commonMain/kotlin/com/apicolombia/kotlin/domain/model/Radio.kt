package com.apicolombia.kotlin.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Radio(
    @SerialName("band")
    val band: String,
    @SerialName("city")
    val city: City,
    @SerialName("cityId")
    val cityId: Int,
    @SerialName("frequency")
    val frequency: Double,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("streamers")
    val streamers: List<String>,
    @SerialName("url")
    val url: String,
)