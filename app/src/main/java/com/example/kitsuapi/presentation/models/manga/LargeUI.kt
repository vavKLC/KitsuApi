package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Large


data class LargeUI(
    val width: Any?,
    val height: Any?
)

fun Large.toUI() =
    LargeUI(width, height)