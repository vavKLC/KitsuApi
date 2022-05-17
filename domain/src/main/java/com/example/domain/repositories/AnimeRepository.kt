package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.anime.Anime
import com.example.domain.models.anime.SingleAnime
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnime>>
}