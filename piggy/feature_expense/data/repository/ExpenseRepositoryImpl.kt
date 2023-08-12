package com.example.piggy.feature_expense.data.repository

import com.example.piggy.feature_expense.data.data_source.ExpenseDao
import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.repository.ExpenseRepository
import kotlinx.coroutines.flow.Flow

class ExpenseRepositoryImpl(
    private val dao: ExpenseDao
) : ExpenseRepository {

    override fun getExpense(): Flow<List<Expense>>{
        return dao.getExpense()
    }

    override suspend fun getExpenseById(id: Int): Expense?{
        return dao.getExpenseById(id)
    }

    override suspend fun upsertExpense(expense: Expense){
        dao.upsertExpense(expense)
    }

    override suspend fun deleteExpense(expense: Expense){
        dao.deleteExpense(expense)
    }

}