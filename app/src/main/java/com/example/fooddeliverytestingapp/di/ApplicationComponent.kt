package com.example.fooddeliverytestingapp.di

import android.app.Application
import android.content.Context
import com.example.fooddeliverytestingapp.presentation.MainFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        PizzaModule::class,
        PizzaUseCaseModule::class,
        NetworkModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(fragment: MainFragment)

    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application,
            @BindsInstance context: Context
        ): ApplicationComponent
    }
}