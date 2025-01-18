package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.TouristicAttraction
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient


class TourismAttractionApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getAll(): Result<List<TouristicAttraction>> {
        return httpClient.safeGet<List<TouristicAttraction>>(Constants.ATTRACTIONS_ENDPOINT)
    }

    suspend fun get(id: Int): Result<TouristicAttraction> {
        return httpClient.safeGet<TouristicAttraction>(Constants.ATTRACTIONS_ENDPOINT + "/$id")
    }
}