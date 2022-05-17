package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.AnimeCharacters


data class AnimeCharactersUI(
    val links: LinksXXXXXXXXXXXUI?
)

fun AnimeCharacters.toUI() =
    AnimeCharactersUI(links?.toUI())