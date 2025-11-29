package com.rudra.smallshopkeeper.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "activities")
data class ActivityEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val type: String,
    val description: String,
    val timestamp: Long = System.currentTimeMillis(),
    val amount: Double
)