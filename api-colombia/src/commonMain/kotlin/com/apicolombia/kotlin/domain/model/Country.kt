package com.apicolombia.kotlin.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Country(
    @SerialName("aircraftPrefix")
    val aircraftPrefix: String,
    @SerialName("borders")
    val borders: List<String>,
    @SerialName("currency")
    val currency: String,
    @SerialName("currencyCode")
    val currencyCode: String,
    @SerialName("currencySymbol")
    val currencySymbol: String,
    @SerialName("description")
    val description: String,
    @SerialName("flags")
    val flags: List<String>,
    @SerialName("id")
    val id: Int,
    @SerialName("internetDomain")
    val internetDomain: String,
    @SerialName("isoCode")
    val isoCode: String,
    @SerialName("languages")
    val languages: List<String>,
    @SerialName("name")
    val name: String,
    @SerialName("phonePrefix")
    val phonePrefix: String,
    @SerialName("population")
    val population: Int,
    @SerialName("radioPrefix")
    val radioPrefix: String,
    @SerialName("region")
    val region: String,
    @SerialName("stateCapital")
    val stateCapital: String,
    @SerialName("subRegion")
    val subRegion: String,
    @SerialName("surface")
    val surface: Int,
    @SerialName("timeZone")
    val timeZone: String
)