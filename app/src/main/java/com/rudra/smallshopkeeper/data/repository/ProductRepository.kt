package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.entities.ProductEntity
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getAllProducts(): Flow<List<ProductEntity>>

    suspend fun insertProduct(product: ProductEntity)
}