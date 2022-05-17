package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Small


data class SmallUI(
    val width: Any?,
    val height: Any?
)

fun Small.toUI() =
    SmallUI(width, height)