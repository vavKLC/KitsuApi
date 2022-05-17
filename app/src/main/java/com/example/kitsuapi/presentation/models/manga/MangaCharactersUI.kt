package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.MangaCharacters


data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI?
)

fun MangaCharacters.toUI() =
    MangaCharactersUI(links?.toUI())