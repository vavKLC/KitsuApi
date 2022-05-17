package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LargeX


data class LargeXUI(
    val width: Any?,
    val height: Any?
)

fun LargeX.toUI() =
    LargeXUI(width, height)