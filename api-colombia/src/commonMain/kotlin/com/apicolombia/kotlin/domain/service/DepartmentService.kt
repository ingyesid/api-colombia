package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.Country
import com.apicolombia.kotlin.domain.model.Department
import com.apicolombia.kotlin.domain.model.Region

interface DepartmentService {
    suspend fun getAll(): Result<List<Department>>
    suspend fun get(id: Int): Result<Department>
}