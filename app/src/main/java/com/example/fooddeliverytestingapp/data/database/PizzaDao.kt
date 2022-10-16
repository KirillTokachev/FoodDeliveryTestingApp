package com.example.fooddeliverytestingapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface PizzaDao {

    @Query("SELECT * FROM pizza")
    fun loadPizza(): LiveData<List<PizzaDbModel>>

    @Insert(entity = PizzaDbModel::class, onConflict = REPLACE)
    suspend fun savePizza(pizza: List<PizzaDbModel>)
}