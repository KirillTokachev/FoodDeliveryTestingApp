package com.example.fooddeliverytestingapp.data.repositoryImpl

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.fooddeliverytestingapp.data.database.PizzaDao
import com.example.fooddeliverytestingapp.data.mappers.PizzaDbModelMapPizza
import com.example.fooddeliverytestingapp.data.mappers.PizzaMapToPizzaDbModel
import com.example.fooddeliverytestingapp.domain.model.Pizza
import com.example.fooddeliverytestingapp.domain.repository.PizzaRepository
import javax.inject.Inject

class PizzaRepositoryImpl @Inject constructor(
    private val pizzaDao: PizzaDao,
    private val pizzaDbModelMapPizza: PizzaDbModelMapPizza,
    private val pizzaMapToPizzaDbModel: PizzaMapToPizzaDbModel
) : PizzaRepository {

    override fun getPizzaList(): LiveData<List<Pizza>> {
        return Transformations.map(pizzaDao.loadPizza()) {
            it.map { pizzaDbModel ->
                pizzaDbModelMapPizza(pizzaDbModel)
            }
        }
    }

    override suspend fun setPizzaList(pizzaList: List<Pizza>) {
        pizzaDao.savePizza(pizzaList.map { pizzaMapToPizzaDbModel(it) })
    }
}