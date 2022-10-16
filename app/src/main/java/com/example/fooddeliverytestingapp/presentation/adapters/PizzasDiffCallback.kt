package com.example.fooddeliverytestingapp.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import com.example.fooddeliverytestingapp.domain.model.Pizza

object PizzasDiffCallback : DiffUtil.ItemCallback<Pizza>() {

    override fun areItemsTheSame(oldItem: Pizza, newItem: Pizza): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Pizza, newItem: Pizza): Boolean {
        return oldItem == newItem
    }
}