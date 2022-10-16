package com.example.fooddeliverytestingapp.data.use_cases_impl.pizzaUseCase

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Pizza
import com.example.fooddeliverytestingapp.domain.repository.PizzaRepository
import com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases.LoadPizzaListUseCase
import javax.inject.Inject

class LoadPizzaListUseCaseImpl @Inject constructor(
    private val pizzaRepository: PizzaRepository
) : LoadPizzaListUseCase {

    override fun loadPizza(): LiveData<List<Pizza>> {
        return pizzaRepository.getPizzaList()
    }
}