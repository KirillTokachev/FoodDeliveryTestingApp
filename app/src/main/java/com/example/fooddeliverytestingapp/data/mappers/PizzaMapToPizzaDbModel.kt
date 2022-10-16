package com.example.fooddeliverytestingapp.data.mappers

import com.example.fooddeliverytestingapp.data.database.PizzaDbModel
import com.example.fooddeliverytestingapp.domain.model.Pizza
import javax.inject.Inject

class PizzaMapToPizzaDbModel @Inject constructor() : (Pizza) -> PizzaDbModel {

    override fun invoke(pizza: Pizza) =
        with(pizza) {
            PizzaDbModel(
                id = id,
                name = name,
                description = description,
                price = price,
                banner = banner
            )
        }
}