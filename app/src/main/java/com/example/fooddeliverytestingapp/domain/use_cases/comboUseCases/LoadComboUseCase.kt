package com.example.fooddeliverytestingapp.domain.use_cases.comboUseCases

import androidx.lifecycle.LiveData
import com.example.fooddeliverytestingapp.domain.model.Combo

interface LoadComboUseCase {

    fun loadCombo(): LiveData<List<Combo>>
}