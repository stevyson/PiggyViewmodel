package com.example.piggy.feature_expense.domain.use_case.expense_usecase

import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.repository.ExpenseRepository
import com.example.piggy.feature_expense.domain.util.ExpenseOrder
import com.example.piggy.feature_expense.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetAllExpense(
    private val repository: ExpenseRepository
) {
    operator fun invoke(
        expenseOrder: ExpenseOrder = ExpenseOrder.Date(OrderType.Descending)
    ): Flow<List<Expense>> {
        return repository.getExpense().map { expense ->
            when (expenseOrder.orderType) {
                is OrderType.Ascending -> {
                    when (expenseOrder) {
                        is ExpenseOrder.Date -> expense.sortedBy { it.timestamp }
                        is ExpenseOrder.Title -> expense.sortedBy { it.title.lowercase() }
                    }
                }

                is OrderType.Descending -> {
                    when (expenseOrder) {
                        is ExpenseOrder.Date -> expense.sortedByDescending { it.timestamp }
                        is ExpenseOrder.Title -> expense.sortedByDescending { it.title.lowercase() }
                    }
                }
            }

        }
    }
}