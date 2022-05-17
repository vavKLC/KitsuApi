package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.CoverImage

data class CoverImageUI(
    val tiny: String?,
    val small: String?,
    val large: String?,
    val original: String?,
    val meta: MetaXUI?
)

fun CoverImage.toUI() =
    CoverImageUI(tiny, small, large, original, meta?.toUI())