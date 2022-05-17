package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Genres


data class GenresUI(
    val links: LinksXUI?
)

fun Genres.toUI() =
    GenresUI(links?.toUI())