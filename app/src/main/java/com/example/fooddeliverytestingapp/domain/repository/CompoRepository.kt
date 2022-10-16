package com.example.fooddeliverytestingapp.domain.repository

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Combo

interface CompoRepository {

    fun getComboList(): LiveData<List<Combo>>

    fun setComboList(comboList: List<Combo>)
}