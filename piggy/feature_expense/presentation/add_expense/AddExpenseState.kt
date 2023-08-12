package com.example.piggy.feature_expense.presentation.add_expense
import com.example.piggy.feature_expense.presentation.add_expense.component.ExpenseTag


data class AddExpenseState(
    val isSelected: Boolean = false,
    val expenseTags: List<ExpenseTag> = listOf(
        ExpenseTag("Groceries", 0.0),
        ExpenseTag("Transportation", 0.0),
        ExpenseTag("Rent", 0.0),
        ExpenseTag("Utilities", 0.0),
        ExpenseTag("Dining Out", 0.0),
        ExpenseTag("Entertainment", 0.0),
        ExpenseTag("Healthcare", 0.0),
        ExpenseTag("Clothing", 0.0),
        ExpenseTag("Phone Bill", 0.0),
        ExpenseTag("Internet", 0.0),
        ExpenseTag("Gym Membership", 0.0),
        ExpenseTag("Coffee", 0.0),
        ExpenseTag("Snacks", 0.0),
        ExpenseTag("Gifts", 0.0),
        ExpenseTag("Movies", 0.0),
        ExpenseTag("Public Transport", 0.0),
        ExpenseTag("Books", 0.0),
        ExpenseTag("Subscriptions", 0.0),
        ExpenseTag("Travel", 0.0),
        ExpenseTag("Home Supplies", 0.0),
        ExpenseTag("Pet Expenses", 0.0),
        ExpenseTag("Car Maintenance", 0.0),
        ExpenseTag("Insurance", 0.0),
        ExpenseTag("Charity", 0.0),
        ExpenseTag("Kids' Activities", 0.0),
        ExpenseTag("Personal Care", 0.0),
        ExpenseTag("House Cleaning", 0.0),
        ExpenseTag("Tuition", 0.0),
        ExpenseTag("Miscellaneous", 0.0)
    ),
    val isCreatingExpense: Boolean = false,
    val title: String = ""
)
