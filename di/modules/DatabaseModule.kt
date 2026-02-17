package com.example.filmssearch3.di.modules

import com.example.filmssearch3.data.MainRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import android.content.Context
import com.example.filmssearch3.data.db.DatabaseHelper


@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabaseHelper(context: Context) = DatabaseHelper(context)

    @Provides
    @Singleton
    fun provideRepository(databaseHelper: DatabaseHelper) = MainRepository(databaseHelper)
}