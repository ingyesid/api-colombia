package com.apicolombia.kotlin.domain.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class City(
    @SerialName("department")
    val department: Department? = null,
    @SerialName("departmentId")
    val departmentId: Int,
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("population")
    val population: Int? = null,
    @SerialName("postalCode")
    val postalCode: String? = null,
    @SerialName("surface")
    val surface: Int? = null,
)