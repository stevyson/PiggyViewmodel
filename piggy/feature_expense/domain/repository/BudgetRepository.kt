package com.example.piggy.feature_expense.domain.repository

import com.example.piggy.feature_expense.domain.model.Budget

interface BudgetRepository {

    suspend fun upsertBudget(budget: Budget)

    suspend fun deleteBudget(budget: Budget)

    suspend fun getBudgetById(id: Int): Budget?

}