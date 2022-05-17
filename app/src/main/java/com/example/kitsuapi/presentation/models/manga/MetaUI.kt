package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Meta


data class MetaUI(
    val dimensionsUI: DimensionsUI?
)

fun Meta.toUI() =
    MetaUI(dimensions?.toUI())