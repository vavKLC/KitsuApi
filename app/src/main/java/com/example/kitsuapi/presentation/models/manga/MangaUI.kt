package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Manga


data class MangaUI(
    val data: List<DataUI>?,
    val meta: MetaXXUI?,
    val links: LinksXXXXXXXXXXXUI?
)

fun Manga.toUI() =
    MangaUI(data?.map { it.toUI() }, meta?.toUI(), links?.toUI())