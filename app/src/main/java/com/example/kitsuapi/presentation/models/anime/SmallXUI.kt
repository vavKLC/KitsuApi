package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.SmallX


data class SmallXUI(
    val width: Any?,
    val height: Any?
)

fun SmallX.toUI() =
    SmallXUI(width, height)