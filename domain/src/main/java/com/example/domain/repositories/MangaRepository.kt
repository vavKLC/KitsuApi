package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.manga.SingleManga
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchMangaDetails(id: String): Flow<Either<String, SingleManga>>
}