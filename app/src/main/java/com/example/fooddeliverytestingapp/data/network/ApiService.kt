package com.example.fooddeliverytestingapp.data.network

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {

    @GET(Gets.PIZZAS)
    @Headers(
        "Content-Type: application/json"
    )
    suspend fun fetchPizzas(): JsonArray
}