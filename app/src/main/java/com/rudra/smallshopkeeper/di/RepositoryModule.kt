package com.rudra.smallshopkeeper.di

import com.rudra.smallshopkeeper.data.repository.ActivityRepository
import com.rudra.smallshopkeeper.data.repository.ActivityRepositoryImpl
import com.rudra.smallshopkeeper.data.repository.ExpenseRepository
import com.rudra.smallshopkeeper.data.repository.ExpenseRepositoryImpl
import com.rudra.smallshopkeeper.data.repository.ProductRepository
import com.rudra.smallshopkeeper.data.repository.ProductRepositoryImpl
import com.rudra.smallshopkeeper.data.repository.SaleRepository
import com.rudra.smallshopkeeper.data.repository.SaleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindProductRepository(
        productRepositoryImpl: ProductRepositoryImpl
    ): ProductRepository

    @Binds
    @Singleton
    abstract fun bindSaleRepository(
        saleRepositoryImpl: SaleRepositoryImpl
    ): SaleRepository

    @Binds
    @Singleton
    abstract fun bindExpenseRepository(
        expenseRepositoryImpl: ExpenseRepositoryImpl
    ): ExpenseRepository

    @Binds
    @Singleton
    abstract fun bindActivityRepository(
        activityRepositoryImpl: ActivityRepositoryImpl
    ): ActivityRepository
}