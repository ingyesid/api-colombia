package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.PresidentApiClient
import com.apicolombia.kotlin.domain.model.President
import com.apicolombia.kotlin.domain.service.PresidentService

class PresidentServiceImpl(
    private val presidentApiClient: PresidentApiClient,
) : PresidentService {

    override suspend fun getAll(): Result<List<President>> = presidentApiClient.getAll()

    override suspend fun get(id: Int): Result<President> = presidentApiClient.get(id)

}