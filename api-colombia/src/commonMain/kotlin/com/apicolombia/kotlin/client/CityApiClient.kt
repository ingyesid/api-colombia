package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.City
import com.apicolombia.kotlin.domain.model.Country
import com.apicolombia.kotlin.domain.model.Region
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient
import kotlinx.serialization.descriptors.StructureKind


class CityApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getAll(): Result<List<City>> {
        return httpClient.safeGet<List<City>>(Constants.CITIES_ENDPOINT)
    }

    suspend fun get(id: Int): Result<City> {
        return httpClient.safeGet<City>(Constants.CITIES_ENDPOINT + "/$id")
    }
}