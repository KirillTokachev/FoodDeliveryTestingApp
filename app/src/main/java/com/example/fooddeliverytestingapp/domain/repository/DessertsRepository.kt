package com.example.fooddeliverytestingapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Desserts

interface DessertsRepository {

    fun getDessertsList(): LiveData<List<Desserts>>

    fun setDessertsList(dessertsList: List<Desserts>)
}