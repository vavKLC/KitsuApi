package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.MetaX

data class MetaXUI(
    val dimensions: DimensionsXUI?
)

fun MetaX.toUI() =
    MetaXUI(dimensions?.toUI())