package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.CityApiClient
import com.apicolombia.kotlin.domain.model.City
import com.apicolombia.kotlin.domain.service.CityService

class CityServiceImpl(
    private val cityApiClient: CityApiClient,
) : CityService {

    override suspend fun getAll(): Result<List<City>> = cityApiClient.getAll()

    override suspend fun get(id: Int): Result<City> = cityApiClient.get(id)

}