package com.example.filmssearch3.di.modules

import com.example.filmssearch3.data.MainRepository
import com.example.filmssearch3.data.TmdbApi
import com.example.filmssearch3.domain.Interactor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DomainModule {
    @Singleton
    @Provides
    fun provideInteractor(repository: MainRepository, tmdbApi: TmdbApi) = Interactor(repo = repository, retrofitService = tmdbApi)
}