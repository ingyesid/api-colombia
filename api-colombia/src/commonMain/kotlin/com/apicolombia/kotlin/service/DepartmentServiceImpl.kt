package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.DepartmentApiClient
import com.apicolombia.kotlin.domain.model.Department
import com.apicolombia.kotlin.domain.service.DepartmentService

class DepartmentServiceImpl(
    private val departmentApiClient: DepartmentApiClient,
) : DepartmentService {

    override suspend fun getAll(): Result<List<Department>> = departmentApiClient.getAll()

    override suspend fun get(id: Int): Result<Department> = departmentApiClient.get(id)

}