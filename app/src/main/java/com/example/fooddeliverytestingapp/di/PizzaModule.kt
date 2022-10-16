package com.example.fooddeliverytestingapp.di

import android.app.Application
import com.example.fooddeliverytestingapp.data.database.AppDataBase
import com.example.fooddeliverytestingapp.data.database.PizzaDao
import com.example.fooddeliverytestingapp.data.repositoryImpl.PizzaRepositoryImpl
import com.example.fooddeliverytestingapp.domain.repository.PizzaRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface PizzaModule {

    @Binds
    fun bindPizzaRepository(impl: PizzaRepositoryImpl): PizzaRepository

    companion object {
        @JvmStatic
        @Provides
        fun providePizzaDao(application: Application): PizzaDao {
            return AppDataBase.getInstance(application).getPizzaDao()
        }
    }
}