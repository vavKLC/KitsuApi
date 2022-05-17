package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.SingleManga

data class SingleMangaUI(
    val data: DataUI
)

fun SingleManga.toUI() =
    SingleMangaUI(data.toUI())