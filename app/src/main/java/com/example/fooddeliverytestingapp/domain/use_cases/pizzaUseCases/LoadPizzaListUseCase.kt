package com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Pizza

interface LoadPizzaListUseCase {

    fun loadPizza(): LiveData<List<Pizza>>
}