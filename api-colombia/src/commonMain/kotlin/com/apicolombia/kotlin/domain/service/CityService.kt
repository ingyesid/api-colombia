package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.City
import com.apicolombia.kotlin.domain.model.Department

interface CityService {
    suspend fun getAll(): Result<List<City>>
    suspend fun get(id: Int): Result<City>
}