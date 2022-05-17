package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.SingleAnime

data class SingleAnimeUI(
    val data: DataUI
)

fun SingleAnime.toUI() =
    SingleAnimeUI(data.toUI())