package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Genres


data class GenresUI(
    val links: LinksXUI?
)

fun Genres.toUI() =
    GenresUI(links?.toUI())