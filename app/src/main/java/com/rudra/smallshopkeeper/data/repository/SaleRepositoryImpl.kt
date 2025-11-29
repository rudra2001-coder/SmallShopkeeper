package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.dao.SaleDao
import com.rudra.smallshopkeeper.data.entities.SaleEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SaleRepositoryImpl @Inject constructor(
    private val saleDao: SaleDao
) : SaleRepository {

    override fun getAllSales(): Flow<List<SaleEntity>> = saleDao.getAllSales()

    override suspend fun insertSale(sale: SaleEntity): Long {
        return saleDao.insertSale(sale)
    }
}