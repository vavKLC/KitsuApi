package com.example.kitsuapi.di

import com.example.data.repositories.AnimeRepositoryImpl
import com.example.data.repositories.AuthenticationRepositoryImpl
import com.example.data.repositories.MangaRepositoryImpl
import com.example.domain.repositories.AnimeRepository
import com.example.domain.repositories.AuthenticationRepository
import com.example.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun provideAnimeRepository(animeRepository: AnimeRepositoryImpl): AnimeRepository

    @Binds
    abstract fun provideMangaRepository(mangaRepository: MangaRepositoryImpl): MangaRepository

    @Binds
    abstract fun provideAuthenticationRepository(authenticationRepository: AuthenticationRepositoryImpl):
            AuthenticationRepository
}