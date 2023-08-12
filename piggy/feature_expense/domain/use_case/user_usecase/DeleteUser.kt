package com.example.piggy.feature_expense.domain.use_case.user_usecase

import com.example.piggy.feature_expense.domain.model.User
import com.example.piggy.feature_expense.domain.repository.UserRepository

class DeleteUser(
    private val repository: UserRepository
) {
    suspend operator fun invoke(user: User){
        repository.deleteUser(user)
    }
}