package com.example.fooddeliverytestingapp.domain.use_cases.drinksUseCase

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Drinks

interface LoadDrinksUseCase {

    fun loadDrinks(): LiveData<List<Drinks>>
}