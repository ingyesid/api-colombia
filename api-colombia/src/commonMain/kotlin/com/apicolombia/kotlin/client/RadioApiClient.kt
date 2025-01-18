package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.Radio
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient


class RadioApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getAll(): Result<List<Radio>> {
        return httpClient.safeGet<List<Radio>>(Constants.RADIOS_ENDPOINT)
    }

    suspend fun get(id: Int): Result<Radio> {
        return httpClient.safeGet<Radio>(Constants.RADIOS_ENDPOINT + "/$id")
    }
}