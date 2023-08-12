package com.example.piggy.feature_expense.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.piggy.feature_expense.domain.model.User

@Dao
interface UserDao {

    @Upsert
    suspend fun upsertUser(user: User)

    @Query("SELECT * FROM user WHERE id = :id")
    suspend fun getUserById(id: Int): User?

    @Delete
    suspend fun deleteUser(user: User)


}