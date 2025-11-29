package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.dao.ProductDao
import com.rudra.smallshopkeeper.data.entities.ProductEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productDao: ProductDao
) : ProductRepository {

    override fun getAllProducts(): Flow<List<ProductEntity>> = productDao.getAllProducts()

    override suspend fun insertProduct(product: ProductEntity) {
        productDao.insertProduct(product)
    }

    override suspend fun updateProduct(product: ProductEntity) {
        productDao.updateProduct(product)
    }

    override suspend fun deleteProduct(product: ProductEntity) {
        productDao.deleteProduct(product)
    }
}