package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Meta


data class MetaUI(
    val dimensionsUI: DimensionsUI?
)

fun Meta.toUI() =
    MetaUI(dimensions?.toUI())