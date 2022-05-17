package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Large


data class LargeUI(
    val width: Any?,
    val height: Any?
)

fun Large.toUI() =
    LargeUI(width, height)