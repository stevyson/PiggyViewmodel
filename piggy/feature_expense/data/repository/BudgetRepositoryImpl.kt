package com.example.piggy.feature_expense.data.repository

import com.example.piggy.feature_expense.data.data_source.BudgetDao
import com.example.piggy.feature_expense.domain.model.Budget
import com.example.piggy.feature_expense.domain.repository.BudgetRepository

class BudgetRepositoryImpl(
    private val dao: BudgetDao
) : BudgetRepository {
    override suspend fun upsertBudget(budget: Budget){
        dao.upsertBudget(budget)
    }

    override suspend fun deleteBudget(budget: Budget){
        dao.deleteBudget(budget)
    }

    override suspend fun getBudgetById(id: Int): Budget? {
        return dao.getBudgetById(id)
    }
}