package com.example.fooddeliverytestingapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Drinks

interface DrinksRepository {

    fun getDrinksList(): LiveData<List<Drinks>>

    fun setDrinksList(drinksList: List<Drinks>)
}