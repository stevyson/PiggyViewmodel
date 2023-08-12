package com.example.piggy.feature_expense.domain.use_case.budget_usecase

import com.example.piggy.feature_expense.domain.model.Budget
import com.example.piggy.feature_expense.domain.repository.BudgetRepository


class AddBudget(
    private val repository: BudgetRepository
){
    suspend operator fun invoke(budget: Budget){
        repository.upsertBudget(budget)
    }
}