package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Tiny


data class TinyUI(
    val width: Any?,
    val height: Any?
)

fun Tiny.toUI() =
    TinyUI(width, height)