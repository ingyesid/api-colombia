package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.CountryApiClient
import com.apicolombia.kotlin.domain.service.CountryService

class CountryServiceImpl(
    private val countryApiClient: CountryApiClient,
) : CountryService {

    override suspend fun info() = countryApiClient.getCountryInfo()
}