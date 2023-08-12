package com.example.piggy.feature_expense.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.piggy.feature_expense.domain.model.Budget
import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.model.User


@Database(
    entities = [Expense::class, Budget::class, User::class],
    version = 1
)
abstract class MainDatabase: RoomDatabase() {

    abstract val dao: AllDao

    companion object {
        const val DATABASE_NAME = "Main_db"
    }
}