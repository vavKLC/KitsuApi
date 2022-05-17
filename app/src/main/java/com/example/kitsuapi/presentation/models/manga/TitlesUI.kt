package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Titles


data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun Titles.toUI() =
    TitlesUI(en, enJp, jaJp)