package com.apicolombia.kotlin.domain.client

fun interface SearchableApiClient<T> {
    suspend fun search(query: String): Result<List<T>>
}