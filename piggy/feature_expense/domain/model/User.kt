package com.example.piggy.feature_expense.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    val name: String,
    val occupation: String,
    @PrimaryKey(autoGenerate = true)
    val id : Int?
)
