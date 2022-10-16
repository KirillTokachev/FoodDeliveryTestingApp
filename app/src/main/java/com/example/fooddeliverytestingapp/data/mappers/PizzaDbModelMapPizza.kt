package com.example.fooddeliverytestingapp.data.mappers

import com.example.fooddeliverytestingapp.data.database.PizzaDbModel
import com.example.fooddeliverytestingapp.domain.model.Pizza
import javax.inject.Inject

class PizzaDbModelMapPizza @Inject constructor() : (PizzaDbModel) -> Pizza {

    override fun invoke(pizzaDbModel: PizzaDbModel) =
        with(pizzaDbModel) {
            Pizza(
                id = id,
                name = name,
                description = description,
                price = price,
                banner = banner
            )
        }
}