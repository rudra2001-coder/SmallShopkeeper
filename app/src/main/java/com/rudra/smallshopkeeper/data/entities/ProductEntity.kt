package com.rudra.smallshopkeeper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val buyPrice: Double,
    val sellPrice: Double,
    val stock: Int,
    val category: String,
    val timestamp: Long = System.currentTimeMillis()
)