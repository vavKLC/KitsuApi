package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Titles


data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun Titles.toUI() =
    TitlesUI(en, enJp, jaJp)