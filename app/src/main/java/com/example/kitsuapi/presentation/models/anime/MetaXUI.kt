package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.MetaX


data class MetaXUI(
    val dimensions: DimensionsXUI?
)

fun MetaX.toUI() =
    MetaXUI(dimensions?.toUI())