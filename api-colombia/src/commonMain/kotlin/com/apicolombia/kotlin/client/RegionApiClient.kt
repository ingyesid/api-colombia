package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.Region
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient


class RegionApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getAll(): Result<List<Region>> {
        return httpClient.safeGet<List<Region>>(Constants.REGIONS_ENDPOINT)
    }

    suspend fun get(id: Int): Result<Region> {
        return httpClient.safeGet<Region>(Constants.REGIONS_ENDPOINT + "/$id")
    }
}