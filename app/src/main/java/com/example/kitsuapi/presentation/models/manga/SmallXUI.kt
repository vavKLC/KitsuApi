package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.SmallX


data class SmallXUI(
    val width: Any?,
    val height: Any?
)

fun SmallX.toUI() =
    SmallXUI(width, height)