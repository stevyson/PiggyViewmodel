package com.example.piggy.feature_expense.domain.use_case.budget_usecase

data class BudgetUseCases(
    val addBudget: AddBudget,
    val deleteBudget: DeleteBudget,
    val getBudget: GetBudget
)
