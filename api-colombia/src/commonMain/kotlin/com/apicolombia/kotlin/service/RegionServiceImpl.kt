package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.RegionApiClient
import com.apicolombia.kotlin.domain.service.RegionService

class RegionServiceImpl(
    private val regionApiClient: RegionApiClient,
) : RegionService {
    override suspend fun getAll() = regionApiClient.getAll()

    override suspend fun get(id: Int) = regionApiClient.get(id)
}