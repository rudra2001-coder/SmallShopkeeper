package com.rudra.smallshopkeeper.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rudra.smallshopkeeper.data.converters.DateConverter
import com.rudra.smallshopkeeper.data.dao.ActivityDao
import com.rudra.smallshopkeeper.data.dao.ExpenseDao
import com.rudra.smallshopkeeper.data.dao.ProductDao
import com.rudra.smallshopkeeper.data.dao.SaleDao
import com.rudra.smallshopkeeper.data.dao.SaleItemDao
import com.rudra.smallshopkeeper.data.entities.ActivityEntity
import com.rudra.smallshopkeeper.data.entities.ExpenseEntity
import com.rudra.smallshopkeeper.data.entities.ProductEntity
import com.rudra.smallshopkeeper.data.entities.SaleEntity
import com.rudra.smallshopkeeper.data.entities.SaleItemEntity

@Database(
    entities = [
        ProductEntity::class,
        SaleEntity::class,
        SaleItemEntity::class,
        ExpenseEntity::class,
        ActivityEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao
    abstract fun saleDao(): SaleDao
    abstract fun saleItemDao(): SaleItemDao
    abstract fun expenseDao(): ExpenseDao
    abstract fun activityDao(): ActivityDao
}