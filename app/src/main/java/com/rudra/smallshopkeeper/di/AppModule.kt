package com.rudra.smallshopkeeper.di

import android.content.Context
import androidx.room.Room
import com.rudra.smallshopkeeper.data.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "small_shopkeeper.db"
        ).build()
    }

    @Provides
    fun provideProductDao(appDatabase: AppDatabase) = appDatabase.productDao()

    @Provides
    fun provideSaleDao(appDatabase: AppDatabase) = appDatabase.saleDao()

    @Provides
    fun provideSaleItemDao(appDatabase: AppDatabase) = appDatabase.saleItemDao()

    @Provides
    fun provideExpenseDao(appDatabase: AppDatabase) = appDatabase.expenseDao()

    @Provides
    fun provideActivityDao(appDatabase: AppDatabase) = appDatabase.activityDao()
}