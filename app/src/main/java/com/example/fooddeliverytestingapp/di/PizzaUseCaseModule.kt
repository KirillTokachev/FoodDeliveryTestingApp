package com.example.fooddeliverytestingapp.di

import com.example.fooddeliverytestingapp.data.use_cases_impl.pizzaUseCase.LoadPizzaListUseCaseImpl
import com.example.fooddeliverytestingapp.data.use_cases_impl.pizzaUseCase.SavePizzaUseCaseImpl
import com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases.LoadPizzaListUseCase
import com.example.fooddeliverytestingapp.domain.use_cases.pizzaUseCases.SavePizzaUseCase
import dagger.Binds
import dagger.Module

@Module
interface PizzaUseCaseModule {

    @Binds
    fun bindLoadPizzaListUseCase(impl: LoadPizzaListUseCaseImpl): LoadPizzaListUseCase

    @Binds
    fun bindSavePizzaUseCase(impl: SavePizzaUseCaseImpl): SavePizzaUseCase
}