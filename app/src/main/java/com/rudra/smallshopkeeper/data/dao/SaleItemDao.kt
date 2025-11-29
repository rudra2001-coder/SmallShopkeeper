package com.rudra.smallshopkeeper.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.rudra.smallshopkeeper.data.entities.SaleItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SaleItemDao {

    @Insert
    suspend fun insertSaleItem(saleItem: SaleItemEntity)

    @Query("SELECT * FROM sale_items WHERE saleId = :saleId")
    fun getSaleItems(saleId: Long): Flow<List<SaleItemEntity>>
}