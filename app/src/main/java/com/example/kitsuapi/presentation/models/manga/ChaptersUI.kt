package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Chapters


data class ChaptersUI(
    val links: LinksXXXXXXXXUI?
)

fun Chapters.toUI() =
    ChaptersUI(links?.toUI())