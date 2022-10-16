package com.example.fooddeliverytestingapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [PizzaDbModel::class],
    version = 3,
    exportSchema = false
)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getPizzaDao(): PizzaDao

    companion object {
        private var db: AppDataBase? = null
        private val LOCK = Any()

        fun getInstance(context: Context): AppDataBase {
            synchronized(LOCK) {
                db?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        AppDataBase::class.java,
                        "app_database",
                    ).fallbackToDestructiveMigration()
                        .build()
                db = instance
                return instance
            }
        }
    }
}