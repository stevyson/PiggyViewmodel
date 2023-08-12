package com.example.piggy.feature_expense.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.piggy.feature_expense.domain.model.Expense


@Database(
    entities = [Expense::class],
    version = 1
)
abstract class ExpenseDb: RoomDatabase() {


        abstract val dao: ExpenseDao

        companion object {
            const val EDATABASE_NAME = "EX_db"
        }
}