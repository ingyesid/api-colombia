package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.Country
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient


class CountryApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getCountryInfo(): Result<Country> {
        return httpClient.safeGet<Country>(Constants.COUNTRY_INFO_ENDPOINT)
    }
}