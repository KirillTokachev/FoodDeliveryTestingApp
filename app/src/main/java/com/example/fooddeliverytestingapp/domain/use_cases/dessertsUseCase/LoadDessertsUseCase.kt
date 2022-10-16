package com.example.fooddeliverytestingapp.domain.use_cases.dessertsUseCase

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Desserts

interface LoadDessertsUseCase {

    fun loadDesserts(): LiveData<List<Desserts>>
}