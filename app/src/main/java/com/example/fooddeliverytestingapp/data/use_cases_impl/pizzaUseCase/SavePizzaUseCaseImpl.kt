package com.example.fooddeliverytestingapp.data.use_cases_impl.pizzaUseCase

import com.example.fooddeliverytestingapp.domain.model.Pizza
import com.example.fooddeliverytestingapp.domain.repository.PizzaRepository
import com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases.SavePizzaUseCase
import javax.inject.Inject

class SavePizzaUseCaseImpl @Inject constructor(
    private val repository: PizzaRepository
) : SavePizzaUseCase {

    override suspend fun savePizza(pizzaList: List<Pizza>) {
        repository.setPizzaList(pizzaList)
    }
}