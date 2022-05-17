package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.TinyX


data class TinyXUI(
    val width: Any?,
    val height: Any?
)

fun TinyX.toUI() =
    TinyXUI(width, height)