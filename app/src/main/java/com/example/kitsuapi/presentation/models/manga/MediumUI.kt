package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Medium


data class MediumUI(
    val width: Any?,
    val height: Any?
)

fun Medium.toUI() =
    MediumUI(width, height)