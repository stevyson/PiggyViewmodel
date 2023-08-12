package com.example.piggy.feature_expense.data.repository

import com.example.piggy.feature_expense.data.data_source.UserDao
import com.example.piggy.feature_expense.domain.model.User
import com.example.piggy.feature_expense.domain.repository.UserRepository

class UserRepositoryImpl(
    private val dao: UserDao
) : UserRepository {
    override suspend fun upsertUser(user: User){
        dao.upsertUser(user)
    }

    override suspend fun getUserById(id: Int): User?{
        return dao.getUserById(id)

    }

    override suspend fun deleteUser(user: User){
        dao.deleteUser(user)
    }
}