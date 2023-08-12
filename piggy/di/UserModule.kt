package com.example.piggy.di

import android.app.Application
import androidx.room.Room
import com.example.piggy.feature_expense.data.data_source.UserDb
import com.example.piggy.feature_expense.data.repository.UserRepositoryImpl
import com.example.piggy.feature_expense.domain.repository.UserRepository
import com.example.piggy.feature_expense.domain.use_case.user_usecase.AddUser
import com.example.piggy.feature_expense.domain.use_case.user_usecase.DeleteUser
import com.example.piggy.feature_expense.domain.use_case.user_usecase.GetUser
import com.example.piggy.feature_expense.domain.use_case.user_usecase.UserUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UserModule {
    @Provides
    @Singleton
    fun providesDataBase(app: Application): UserDb {
        return Room.databaseBuilder(
            app,
            UserDb::class.java,
            UserDb.UDATABASE_NAME
        ).build()

    }

    @Provides
    @Singleton
    fun providesRepository(
        db: UserDb,
    ): UserRepository = UserRepositoryImpl(db.dao)

    @Provides
    @Singleton
    fun provideUserUseCases(repository: UserRepository): UserUseCases {
        return UserUseCases(
            addUser = AddUser(repository),
            deleteUser =  DeleteUser(repository),
            getUser = GetUser(repository)
        )
    }
}