package com.example.piggy.feature_expense.domain.util

sealed class ExpenseOrder(val orderType: OrderType){
    class Title(orderType: OrderType): ExpenseOrder(orderType)
    class Date(orderType: OrderType): ExpenseOrder(orderType)


    fun copy(orderType: OrderType): ExpenseOrder {
        return when (this) {
            is Title -> Title(orderType)
            is Date -> Date(orderType)
        }
    }

}
