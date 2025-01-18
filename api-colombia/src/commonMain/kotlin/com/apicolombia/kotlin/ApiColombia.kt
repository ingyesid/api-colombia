package com.apicolombia.kotlin

import com.apicolombia.kotlin.client.CityApiClient
import com.apicolombia.kotlin.client.CountryApiClient
import com.apicolombia.kotlin.client.DepartmentApiClient
import com.apicolombia.kotlin.client.PresidentApiClient
import com.apicolombia.kotlin.client.RadioApiClient
import com.apicolombia.kotlin.client.RegionApiClient
import com.apicolombia.kotlin.client.TourismAttractionApiClient
import com.apicolombia.kotlin.domain.service.CityService
import com.apicolombia.kotlin.domain.service.CountryService
import com.apicolombia.kotlin.domain.service.DepartmentService
import com.apicolombia.kotlin.domain.service.PresidentService
import com.apicolombia.kotlin.domain.service.RadioService
import com.apicolombia.kotlin.domain.service.RegionService
import com.apicolombia.kotlin.domain.service.TouristAttractionService
import com.apicolombia.kotlin.service.CityServiceImpl
import com.apicolombia.kotlin.service.CountryServiceImpl
import com.apicolombia.kotlin.service.DepartmentServiceImpl
import com.apicolombia.kotlin.service.PresidentServiceImpl
import com.apicolombia.kotlin.service.RadioServiceImpl
import com.apicolombia.kotlin.service.RegionServiceImpl
import com.apicolombia.kotlin.service.TourismAttractionServiceImpl
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.serialization.kotlinx.json.json

class ApiColombia(
    private val httpClientEngine: HttpClientEngine,
    private val logsEnabled: Boolean = true,
) {

    private val httpClient by lazy {
        HttpClient(
            engine = httpClientEngine
        ) {
            install(ContentNegotiation) {
                json()
            }
            if (logsEnabled) {
                install(Logging) {
                    logger = Logger.SIMPLE
                    level = LogLevel.BODY
                }
            }
        }
    }

    // API clients
    private val countryApiClient by lazy { CountryApiClient(httpClient) }
    private val regionApiClient by lazy { RegionApiClient(httpClient) }
    private val departmentsApiClient by lazy { DepartmentApiClient(httpClient) }
    private val citiesApiClient by lazy { CityApiClient(httpClient) }
    private val presidentsApiClient by lazy { PresidentApiClient(httpClient) }
    private val radiosApiClient by lazy { RadioApiClient(httpClient) }
    private val attractionApiClient by lazy { TourismAttractionApiClient(httpClient) }

    // Services
    val country: CountryService by lazy {
        CountryServiceImpl(countryApiClient)
    }

    val regions: RegionService by lazy {
        RegionServiceImpl(regionApiClient)
    }

    val departments: DepartmentService by lazy {
        DepartmentServiceImpl(departmentsApiClient)
    }

    val cities: CityService by lazy {
        CityServiceImpl(citiesApiClient)
    }

    val presidents: PresidentService by lazy {
        PresidentServiceImpl(presidentsApiClient)
    }

    val attractions: TouristAttractionService by lazy {
        TourismAttractionServiceImpl(attractionApiClient)
    }

    val radios: RadioService by lazy {
        RadioServiceImpl(radiosApiClient)
    }

}