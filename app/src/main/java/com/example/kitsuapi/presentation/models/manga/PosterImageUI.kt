package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.PosterImage


data class PosterImageUI(
    val tiny: String?,
    val small: String?,
    val medium: String?,
    val large: String?,
    val original: String?,
    val metaUI: MetaUI?
)

fun PosterImage.toUI() =
    PosterImageUI(tiny, small, medium, large, original, meta?.toUI())