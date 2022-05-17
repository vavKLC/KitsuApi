package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Tiny


data class TinyUI(
    val width: Any?,
    val height: Any?
)

fun Tiny.toUI() =
    TinyUI(width, height)