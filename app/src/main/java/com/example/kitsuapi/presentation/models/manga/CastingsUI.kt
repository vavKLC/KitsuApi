package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Castings


data class CastingsUI(
    val links: LinksXXXUI?
)

fun Castings.toUI() =
    CastingsUI(links?.toUI())