package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.entities.ExpenseEntity
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {

    fun getAllExpenses(): Flow<List<ExpenseEntity>>

    suspend fun insertExpense(expense: ExpenseEntity)
}