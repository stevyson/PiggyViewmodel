package com.example.piggy.feature_expense.domain.use_case.user_usecase

import com.example.piggy.feature_expense.domain.model.User
import com.example.piggy.feature_expense.domain.repository.UserRepository

class GetUser(
    private val repository: UserRepository
) {
    suspend operator fun invoke(id : Int): User? {
        return repository.getUserById(id)
    }
}