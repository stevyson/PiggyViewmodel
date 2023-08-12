package com.example.piggy.di

import android.app.Application
import androidx.room.Room
import com.example.piggy.feature_expense.data.data_source.BudgetDb
import com.example.piggy.feature_expense.data.repository.BudgetRepositoryImpl
import com.example.piggy.feature_expense.domain.repository.BudgetRepository
import com.example.piggy.feature_expense.domain.use_case.budget_usecase.AddBudget
import com.example.piggy.feature_expense.domain.use_case.budget_usecase.BudgetUseCases
import com.example.piggy.feature_expense.domain.use_case.budget_usecase.DeleteBudget
import com.example.piggy.feature_expense.domain.use_case.budget_usecase.GetBudget
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object BudgetModule {


        @Provides
        @Singleton
        fun providesDataBase(app: Application): BudgetDb {
            return Room.databaseBuilder(
                app,
                BudgetDb::class.java,
                BudgetDb.BDATABASE_NAME
            ).build()

        }

        @Provides
        @Singleton
        fun providesRepository(
            db: BudgetDb,
        ): BudgetRepository = BudgetRepositoryImpl(db.dao)


    @Provides
    @Singleton
    fun provideBudgetUseCases(repository: BudgetRepository): BudgetUseCases {
        return BudgetUseCases(
            addBudget = AddBudget(repository),
            deleteBudget =  DeleteBudget(repository),
            getBudget = GetBudget(repository)
        )
    }

}