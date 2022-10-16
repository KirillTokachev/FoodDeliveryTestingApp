package com.example.fooddeliverytestingapp.presentation

import android.app.Application
import com.example.fooddeliverytestingapp.di.DaggerApplicationComponent

class FoodDeliveryApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this, applicationContext)
    }
}