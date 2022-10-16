package com.example.fooddeliverytestingapp.data.use_cases_impl.network_use_case

import com.example.fooddeliverytestingapp.data.network.ApiService
import com.example.fooddeliverytestingapp.domain.use_cases.network_use_case.FetchPizzasUseCase
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import javax.inject.Inject

class FetchPizzasUseCaseImpl @Inject constructor(
    private val apiService: ApiService
) : FetchPizzasUseCase {

    override suspend fun fetchPizzas(): JsonArray {
        return apiService.fetchPizzas()
    }
}