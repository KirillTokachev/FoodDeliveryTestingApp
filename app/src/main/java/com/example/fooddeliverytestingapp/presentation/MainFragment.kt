package com.example.fooddeliverytestingapp.presentation

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddeliverytestingapp.R
import com.example.fooddeliverytestingapp.databinding.FragmentMainBinding
import com.example.fooddeliverytestingapp.presentation.adapters.PizzasAdapter
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding
        get() =_binding ?: throw NullPointerException("FragmentMainBinding is null")

    private lateinit var viewModel: MainViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val component by lazy {
        (requireActivity().application as FoodDeliveryApp).component
    }

    override fun onAttach(context: Context) {
        component.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerAdapter = PizzasAdapter()

        binding.menuRv.adapter = recyclerAdapter
        binding.menuRv.layoutManager = LinearLayoutManager(context)

        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
        viewModel.pizzas.observe(viewLifecycleOwner) {
            recyclerAdapter.submitList(it)
        }
    }
}