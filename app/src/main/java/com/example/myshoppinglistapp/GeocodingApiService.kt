package com.example.myshoppinglistapp

import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {

    //google link path
    //This function will return getAddressFromCoordinates
    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlng: String,
        @Query("key") apikey: String
    ): GeoCodingResponse
}