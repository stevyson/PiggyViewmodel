package com.example.piggy.feature_expense.domain.repository

import com.example.piggy.feature_expense.domain.model.Expense
import kotlinx.coroutines.flow.Flow

interface ExpenseRepository {

    fun getExpense(): Flow<List<Expense>>

    suspend fun getExpenseById(id: Int): Expense?

    suspend fun upsertExpense(expense: Expense)

    suspend fun deleteExpense(expense: Expense)


}