package com.rudra.smallshopkeeper.ui.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rudra.smallshopkeeper.data.entities.ProductEntity
import com.rudra.smallshopkeeper.data.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : ViewModel() {

    val products = productRepository.getAllProducts()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun deleteProduct(product: ProductEntity) {
        viewModelScope.launch {
            productRepository.deleteProduct(product)
        }
    }
}