package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.Country
import com.apicolombia.kotlin.domain.model.Region

interface RegionService {
    suspend fun getAll(): Result<List<Region>>
    suspend fun get(id: Int): Result<Region>
}