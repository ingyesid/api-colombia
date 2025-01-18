package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.TouristicAttraction

interface TouristAttractionService {
    suspend fun getAll(): Result<List<TouristicAttraction>>
    suspend fun get(id: Int): Result<TouristicAttraction>
}