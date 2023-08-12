package com.example.piggy.feature_expense.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Budget(
    val amount: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int?
)
