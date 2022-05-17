package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Anime


data class AnimeUI(
    val data: List<DataUI>?,
    val meta: MetaXXUI?,
    val links: LinksXXXXXXXXXXXXXUI?
)

fun Anime.toUI() =
    AnimeUI(data?.map { it.toUI() }, meta?.toUI() , links?.toUI())
