package com.example.piggy.feature_expense.domain.use_case.expense_usecase

data class ExpenseUseCases(
    val addExpense: AddExpense,
    val deleteExpense: DeleteExpense,
    val getExpense: GetExpense,
    val getAllExpense: GetAllExpense
)
