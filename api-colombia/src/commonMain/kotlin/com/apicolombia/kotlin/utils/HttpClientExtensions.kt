package com.apicolombia.kotlin.utils

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.HttpStatusCode
import io.ktor.util.reflect.TypeInfo
import io.ktor.util.reflect.typeInfo
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException

suspend inline fun <reified T> HttpClient.safeGet(
    url: String,
    builder: HttpRequestBuilder.() -> Unit = {},
): Result<T> {
    return try {
        val response: HttpResponse = get(url, builder)
        if (response.status == HttpStatusCode.OK) {
            val data: T = response.body()
            Result.success(data)
        } else {
            Result.failure(Exception("Error: ${response.status.value}"))
        }
    } catch (e: SerializationException) {
        Result.failure(e)
    } catch (e: Exception) {
        Result.failure(e)
    }
}
