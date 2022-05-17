package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Small


data class SmallUI(
    val width: Any?,
    val height: Any?
)

fun Small.toUI() =
    SmallUI(width, height)