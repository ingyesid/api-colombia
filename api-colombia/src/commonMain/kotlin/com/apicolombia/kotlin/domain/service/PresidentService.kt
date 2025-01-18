package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.Department
import com.apicolombia.kotlin.domain.model.President

interface PresidentService {
    suspend fun getAll(): Result<List<President>>
    suspend fun get(id: Int): Result<President>
}