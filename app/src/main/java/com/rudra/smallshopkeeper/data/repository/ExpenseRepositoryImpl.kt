package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.dao.ExpenseDao
import com.rudra.smallshopkeeper.data.entities.ExpenseEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ExpenseRepositoryImpl @Inject constructor(
    private val expenseDao: ExpenseDao
) : ExpenseRepository {

    override fun getAllExpenses(): Flow<List<ExpenseEntity>> = expenseDao.getAllExpenses()

    override suspend fun insertExpense(expense: ExpenseEntity) {
        expenseDao.insertExpense(expense)
    }
}