package com.apicolombia.kotlin.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Department(
    @SerialName("cityCapitalId")
    val cityCapitalId: Int,
    @SerialName("countryId")
    val countryId: Int,
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: Int,
    @SerialName("municipalities")
    val municipalities: Int,
    @SerialName("name")
    val name: String,
    @SerialName("phonePrefix")
    val phonePrefix: String,
    @SerialName("population")
    val population: Int,
    @SerialName("regionId")
    val regionId: Int,
    @SerialName("surface")
    val surface: Int,
    @SerialName("cityCapital")
    val cityCapital: City,
)