package com.example.spacexapp.data.networking.service

import retrofit2.http.GET

interface SpaceXApiService {
    @GET("launches")
    suspend fun getLatestFlights(): List<FlightDto>
}