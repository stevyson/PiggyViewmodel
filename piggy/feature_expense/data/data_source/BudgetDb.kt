package com.example.piggy.feature_expense.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.piggy.feature_expense.domain.model.Budget
import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.model.User


@Database(
    entities = [Budget::class],
    version = 1
)
abstract class BudgetDb :RoomDatabase(){

        abstract val dao: BudgetDao

        companion object {
            const val BDATABASE_NAME = "BD_db"
        }
}