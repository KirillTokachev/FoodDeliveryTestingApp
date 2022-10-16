package com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases

import com.example.fooddeliverytestingapp.domain.model.Pizza

interface SavePizzaUseCase {

    suspend fun savePizza(pizzaList: List<Pizza>)
}