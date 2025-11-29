package com.rudra.smallshopkeeper.ui.products

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rudra.smallshopkeeper.data.entities.ProductEntity
import com.rudra.smallshopkeeper.data.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddProductViewModel @Inject constructor(
    private val productRepository: ProductRepository
) : ViewModel() {

    var productName by mutableStateOf("")
    var buyingPrice by mutableStateOf("")
    var sellingPrice by mutableStateOf("")
    var stock by mutableStateOf("")
    var category by mutableStateOf("")

    fun saveProduct() {
        viewModelScope.launch {
            val product = ProductEntity(
                name = productName,
                buyPrice = buyingPrice.toDouble(),
                sellPrice = sellingPrice.toDouble(),
                stock = stock.toInt(),
                category = category
            )
            productRepository.insertProduct(product)
        }
    }
}