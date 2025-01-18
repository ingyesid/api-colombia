package com.apicolombia.kotlin.client

import com.apicolombia.kotlin.domain.model.City
import com.apicolombia.kotlin.domain.model.Country
import com.apicolombia.kotlin.domain.model.Department
import com.apicolombia.kotlin.domain.model.Region
import com.apicolombia.kotlin.utils.Constants
import com.apicolombia.kotlin.utils.safeGet
import io.ktor.client.HttpClient
import kotlinx.serialization.descriptors.StructureKind


class DepartmentApiClient(
    private val httpClient: HttpClient,
) {

    suspend fun getAll(): Result<List<Department>> {
        return httpClient.safeGet<List<Department>>(Constants.DEPARTMENTS_ENDPOINT)
    }

    suspend fun get(id: Int): Result<Department> {
        return httpClient.safeGet<Department>(Constants.DEPARTMENTS_ENDPOINT + "/$id")
    }
}