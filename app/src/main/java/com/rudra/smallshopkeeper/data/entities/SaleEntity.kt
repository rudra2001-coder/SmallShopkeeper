package com.rudra.smallshopkeeper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sales")
data class SaleEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val totalAmount: Double,
    val profit: Double,
    val paymentMethod: String,
    val timestamp: Long = System.currentTimeMillis(),
    val totalItems: Int
)