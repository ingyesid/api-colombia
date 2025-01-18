package com.apicolombia.kotlin.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TouristicAttraction(
    @SerialName("city")
    val city: City,
    @SerialName("cityId")
    val cityId: Int,
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: Int,
    @SerialName("images")
    val images: List<String>,
    @SerialName("latitude")
    val latitude: String,
    @SerialName("longitude")
    val longitude: String,
    @SerialName("name")
    val name: String,
)