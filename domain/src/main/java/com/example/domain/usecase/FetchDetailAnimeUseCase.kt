package com.example.domain.usecase

import com.example.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchDetailAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeDetails(id)
}