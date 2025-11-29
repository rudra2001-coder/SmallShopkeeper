package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.entities.SaleEntity
import kotlinx.coroutines.flow.Flow

interface SaleRepository {

    fun getAllSales(): Flow<List<SaleEntity>>

    suspend fun insertSale(sale: SaleEntity): Long
}