package com.example.piggy.feature_expense.domain.repository

import com.example.piggy.feature_expense.domain.model.User

interface UserRepository {

    suspend fun upsertUser(user: User)

    suspend fun getUserById(id: Int): User?

    suspend fun deleteUser(user: User)
}