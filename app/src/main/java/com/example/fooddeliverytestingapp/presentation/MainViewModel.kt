package com.example.fooddeliverytestingapp.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fooddeliverytestingapp.data.mappers.JsonMapToPizza
import com.example.fooddeliverytestingapp.domain.use_cases.network_use_case.FetchPizzasUseCase
import com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases.LoadPizzaListUseCase
import com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases.SavePizzaUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val fetchPizzasUseCase: FetchPizzasUseCase,
    private val loadPizzaListUseCase: LoadPizzaListUseCase,
    private val savePizzaUseCase: SavePizzaUseCase,
    private val jsonMapper: JsonMapToPizza
) : ViewModel() {

    val pizzas = loadPizzaListUseCase.loadPizza()

    init {
        viewModelScope.launch {
            loadData()
        }
    }

    private suspend fun loadData() {
        viewModelScope.launch {
            savePizzaUseCase.savePizza(jsonMapper(fetchPizzasUseCase.fetchPizzas()))
        }
    }
}