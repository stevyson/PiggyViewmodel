package com.example.piggy.feature_expense.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.piggy.feature_expense.domain.model.Budget

@Dao
interface BudgetDao {

    @Upsert
    suspend fun upsertBudget(budget: Budget)

    @Delete
    suspend fun deleteBudget(budget: Budget)

    @Query("SELECT * FROM budget WHERE id = :id")
    suspend fun getBudgetById(id: Int): Budget?

}