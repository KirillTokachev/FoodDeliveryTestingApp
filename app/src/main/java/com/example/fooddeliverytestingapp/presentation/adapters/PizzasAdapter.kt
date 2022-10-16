package com.example.fooddeliverytestingapp.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.fooddeliverytestingapp.R
import com.example.fooddeliverytestingapp.databinding.MenuItemBinding
import com.example.fooddeliverytestingapp.domain.model.Pizza
import com.squareup.picasso.Picasso

class PizzasAdapter : ListAdapter<Pizza, PizzasViewHolder>(PizzasDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzasViewHolder {
        val binding = MenuItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PizzasViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PizzasViewHolder, position: Int) {
        val pizza = getItem(position)
        with(holder.binding) {
            with(pizza) {
                Picasso.get().load(banner).into(pizzaImgIv)
                pizzaNameTv.text = name
                pizzaDescriptionTv.text = description
                pizzaPriceBtn.text = price.toString()
            }
        }
    }
}