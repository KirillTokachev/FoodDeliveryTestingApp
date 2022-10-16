package com.example.fooddeliverytestingapp.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pizza")
data class PizzaDbModel(
    @PrimaryKey val id: Long,
    val name: String,
    val description: String,
    val price: Int,
    val banner: String
)
