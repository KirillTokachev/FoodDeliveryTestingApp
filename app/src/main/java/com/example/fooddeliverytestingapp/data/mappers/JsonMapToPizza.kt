package com.example.fooddeliverytestingapp.data.mappers

import com.example.fooddeliverytestingapp.domain.model.Pizza
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import retrofit2.Response
import javax.inject.Inject

class JsonMapToPizza @Inject constructor() : (JsonArray) -> List<Pizza> {

    override fun invoke(jsonArray: JsonArray): List<Pizza> {
        val typeToken = object : TypeToken<List<Pizza>>() {}.type
        return Gson().fromJson(jsonArray, typeToken)
    }
}