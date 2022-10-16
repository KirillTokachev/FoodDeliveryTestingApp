package com.example.fooddeliverytestingapp.domain.use_cases.network_use_case

import com.google.gson.JsonArray
import com.google.gson.JsonObject

interface FetchPizzasUseCase {

    suspend fun fetchPizzas(): JsonArray
}