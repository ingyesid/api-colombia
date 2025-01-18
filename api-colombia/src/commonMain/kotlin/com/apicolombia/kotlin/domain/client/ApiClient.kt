package com.apicolombia.kotlin.domain.client

interface ApiClient<T> {
    suspend fun getAll(): Result<List<T>>
    suspend fun getById(id: String): Result<T>
}