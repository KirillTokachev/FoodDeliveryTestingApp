package com.example.fooddeliverytestingapp.domain.use_cases.comboUseCases

import com.example.fooddeliverytestingapp.domain.model.Combo

interface SaveComboUseCase {

    fun saveCombo(comboList: List<Combo>)
}