package com.example.piggy.feature_expense.presentation.add_expense

import com.example.piggy.feature_expense.presentation.add_expense.component.ExpenseTag

sealed class AddExpenseEvent {
    data class OnExpenseTagSelected(val expenseTag: ExpenseTag) : AddExpenseEvent()
    object OnDoneSelected: AddExpenseEvent()
    data class SetTitle(val title: String) : AddExpenseEvent()
    object OnCreateExpenseTag: AddExpenseEvent()
    object OnDoneCreateExpenseTag: AddExpenseEvent()
}
