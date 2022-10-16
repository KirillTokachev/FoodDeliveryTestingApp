package com.example.fooddeliverytestingapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Pizza

interface PizzaRepository {

    fun getPizzaList(): LiveData<List<Pizza>>

    suspend fun setPizzaList(pizzaList: List<Pizza>)
}