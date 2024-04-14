package com.example.myshoppinglistapp

// This page detail we will get from google cloud gecoding API
data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeoCodingResponse(
    val results: List<GeocodingResult>,
    val status: String
)

data class GeocodingResult(
    val formatted_address: String
)
