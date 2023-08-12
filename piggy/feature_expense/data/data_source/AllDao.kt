package com.example.piggy.feature_expense.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.piggy.feature_expense.domain.model.Budget
import com.example.piggy.feature_expense.domain.model.Expense
import com.example.piggy.feature_expense.domain.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface AllDao {
    //Budget

    @Upsert
    suspend fun upsertBudget(budget: Budget)

    @Delete
    suspend fun deleteBudget(budget: Budget)

    @Query("SELECT * FROM budget WHERE id = :id")
    suspend fun getBudgetById(id: Int): Budget?

    //Expense
    @Query("SELECT * FROM expense")
    fun getExpense(): Flow<List<Expense>>

    @Query("SELECT * FROM expense WHERE id = :id")
    suspend fun getExpenseById(id: Int): Expense?

    @Upsert
    suspend fun upsertExpense(expense: Expense)

    @Delete
    suspend fun deleteExpense(expense: Expense)

    //User
    @Upsert
    suspend fun upsertUser(user: User)

    @Query("SELECT * FROM user WHERE id = :id")
    suspend fun getUserById(id: Int): User?

    @Delete
    suspend fun deleteUser(user: User)
}