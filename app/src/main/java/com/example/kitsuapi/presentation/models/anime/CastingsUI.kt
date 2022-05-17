package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Castings


data class CastingsUI(
    val links: LinksXXXUI?
)

fun Castings.toUI() =
    CastingsUI(links?.toUI())