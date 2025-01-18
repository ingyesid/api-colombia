package com.apicolombia.kotlin.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class President(
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
    @SerialName("lastName")
    val lastName: String,
    @SerialName("name")
    val name: String,
    @SerialName("politicalParty")
    val politicalParty: String,
    @SerialName("startPeriodDate")
    val startPeriodDate: String,
    @SerialName("description")
    val description: String,
    @SerialName("endPeriodDate")
    val endPeriodDate: String,
    @SerialName("cityId")
    val cityId: Int,
    @SerialName("city")
    val city: City? = null,
)