package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.TourismAttractionApiClient
import com.apicolombia.kotlin.domain.service.TouristAttractionService

class TourismAttractionServiceImpl(
    private val tourismAttractionApiClient: TourismAttractionApiClient,
) : TouristAttractionService {
    override suspend fun getAll() = tourismAttractionApiClient.getAll()

    override suspend fun get(id: Int) = tourismAttractionApiClient.get(id)
}