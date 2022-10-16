package com.example.fooddeliverytestingapp.domain.use_cases.drinksUseCase

import com.example.fooddeliverytestingapp.domain.model.Drinks

interface SaveDrinksUseCase {

    fun saveDrinks(drinks: List<Drinks>)
}