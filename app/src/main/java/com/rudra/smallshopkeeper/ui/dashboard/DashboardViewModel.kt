package com.rudra.smallshopkeeper.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rudra.smallshopkeeper.data.repository.ActivityRepository
import com.rudra.smallshopkeeper.data.repository.ExpenseRepository
import com.rudra.smallshopkeeper.data.repository.ProductRepository
import com.rudra.smallshopkeeper.data.repository.SaleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    productRepository: ProductRepository,
    saleRepository: SaleRepository,
    expenseRepository: ExpenseRepository,
    activityRepository: ActivityRepository
) : ViewModel() {

    val products = productRepository.getAllProducts()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val sales = saleRepository.getAllSales()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val expenses = expenseRepository.getAllExpenses()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activities = activityRepository.getAllActivities()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val totalSales = sales.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val totalProfit = sales.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

}
