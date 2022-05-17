package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Medium


data class MediumUI(
    val width: Any?,
    val height: Any?
)

fun Medium.toUI() =
    MediumUI(width, height)