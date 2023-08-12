package com.example.piggy.di

import android.app.Application
import androidx.room.Room
import com.example.piggy.feature_expense.data.data_source.ExpenseDb
import com.example.piggy.feature_expense.data.repository.ExpenseRepositoryImpl
import com.example.piggy.feature_expense.domain.repository.ExpenseRepository
import com.example.piggy.feature_expense.domain.use_case.expense_usecase.AddExpense
import com.example.piggy.feature_expense.domain.use_case.expense_usecase.DeleteExpense
import com.example.piggy.feature_expense.domain.use_case.expense_usecase.ExpenseUseCases
import com.example.piggy.feature_expense.domain.use_case.expense_usecase.GetAllExpense
import com.example.piggy.feature_expense.domain.use_case.expense_usecase.GetExpense
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ExpenseModule {
    @Provides
    @Singleton
    fun providesDataBase(app: Application): ExpenseDb {
        return Room.databaseBuilder(
            app,
            ExpenseDb::class.java,
            ExpenseDb.EDATABASE_NAME
        ).build()

    }

    @Provides
    @Singleton
    fun providesRepository(
        db: ExpenseDb,
    ): ExpenseRepository = ExpenseRepositoryImpl(db.dao)

    @Provides
    @Singleton
    fun provideExpenseUseCases(repository: ExpenseRepository): ExpenseUseCases {
        return ExpenseUseCases(
            addExpense = AddExpense(repository),
            deleteExpense = DeleteExpense(repository),
            getExpense = GetExpense(repository),
            getAllExpense = GetAllExpense(repository)
        )
    }
}