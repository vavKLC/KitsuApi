package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.TinyX


data class TinyXUI(
    val width: Any?,
    val height: Any?
)

fun TinyX.toUI() =
    TinyXUI(width, height)