package com.apicolombia.kotlin.domain.service

import com.apicolombia.kotlin.domain.model.Country

fun interface CountryService {
    suspend fun info(): Result<Country>
}