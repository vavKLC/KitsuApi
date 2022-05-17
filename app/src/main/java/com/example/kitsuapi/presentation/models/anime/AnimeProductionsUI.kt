package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.AnimeProductions


data class AnimeProductionsUI(
    val links: LinksXXXXXXXXXXUI?
)

fun AnimeProductions.toUI() =
    AnimeProductionsUI(links?.toUI())