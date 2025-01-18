package com.apicolombia.kotlin.utils

object Constants {

    private const val API_COLOMBIA_HOST = "api-colombia.com"
    private const val BASE_URL = "https://$API_COLOMBIA_HOST/api/v1"

    // Country endpoints
    const val COUNTRY_INFO_ENDPOINT = "$BASE_URL/Country/Colombia"

    // Regions endpoints
    const val REGIONS_ENDPOINT = "$BASE_URL/Region"

    // Departments endpoints
    const val DEPARTMENTS_ENDPOINT = "$BASE_URL/Departments"

    // Cities endpoints
    const val CITIES_ENDPOINT = "$BASE_URL/City"

    // Radios endpoints
    const val RADIOS_ENDPOINT = "$BASE_URL/Radio"

    const val ATTRACTIONS_ENDPOINT = "$BASE_URL/TouristicAttraction"

    const val PRESIDENTS_ENDPOINT = "$BASE_URL/President"
}