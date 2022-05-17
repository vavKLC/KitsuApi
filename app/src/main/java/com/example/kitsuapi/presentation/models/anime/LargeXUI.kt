package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LargeX


data class LargeXUI(
    val width: Any?,
    val height: Any?
)

fun LargeX.toUI() =
    LargeXUI(width, height)