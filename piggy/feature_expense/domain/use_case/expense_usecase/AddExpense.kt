package com.example.piggy.feature_expense.domain.use_case.expense_usecase

import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.repository.ExpenseRepository

class AddExpense(
    private val repository: ExpenseRepository
) {

    suspend operator fun invoke(expense: Expense) {
        repository.upsertExpense(expense)
    }

}