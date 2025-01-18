package com.apicolombia.kotlin.service

import com.apicolombia.kotlin.client.RadioApiClient
import com.apicolombia.kotlin.domain.model.Radio
import com.apicolombia.kotlin.domain.service.RadioService

class RadioServiceImpl(
    private val radioApiClient: RadioApiClient,
) : RadioService {

    override suspend fun getAll(): Result<List<Radio>> = radioApiClient.getAll()

    override suspend fun get(id: Int): Result<Radio> = radioApiClient.get(id)

}