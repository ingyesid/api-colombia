package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.Country
import com.apicolombia.kotlin.domain.model.Department
import com.apicolombia.kotlin.domain.model.President
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient


class PresidentApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getAll(): Result<List<President>> {
        return httpClient.safeGet<List<President>>(Constants.PRESIDENTS_ENDPOINT)
    }

    suspend fun get(id: Int): Result<President> {
        return httpClient.safeGet<President>(Constants.PRESIDENTS_ENDPOINT + "/$id")
    }
}