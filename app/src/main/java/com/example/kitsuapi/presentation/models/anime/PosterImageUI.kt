package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.PosterImage


data class PosterImageUI(
    val tiny: String?,
    val small: String?,
    val medium: String?,
    val large: String?,
    val original: String?,
    val meta: MetaUI?
)

fun PosterImage.toUI() =
    PosterImageUI(tiny, small, medium, large, original, meta?.toUI())