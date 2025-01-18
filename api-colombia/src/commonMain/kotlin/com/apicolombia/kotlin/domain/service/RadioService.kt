package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.City
import com.apicolombia.kotlin.domain.model.Department
import com.apicolombia.kotlin.domain.model.Radio

interface RadioService {
    suspend fun getAll(): Result<List<Radio>>
    suspend fun get(id: Int): Result<Radio>
}