package com.example.fooddeliverytestingapp.di

import com.example.fooddeliverytestingapp.data.network.ApiFactory
import com.example.fooddeliverytestingapp.data.network.ApiService
import com.example.fooddeliverytestingapp.data.use_cases_impl.network_use_case.FetchPizzasUseCaseImpl
import com.example.fooddeliverytestingapp.domain.use_cases.network_use_case.FetchPizzasUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
interface NetworkModule {

    @Binds
    fun bindFetchPizzasUseCase(impl: FetchPizzasUseCaseImpl): FetchPizzasUseCase

    companion object {
        @Provides
        @Singleton
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }
}