package com.example.piggy.feature_expense.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.model.User


@Database(
    entities = [User::class],
    version = 1
)
abstract class UserDb : RoomDatabase() {

    abstract val dao: UserDao

    companion object {
        const val UDATABASE_NAME = "UR_db"
    }

}