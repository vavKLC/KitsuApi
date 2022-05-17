package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Episodes


data class EpisodesUI(
    val links: LinksXXXXXXXXUI?
)

fun Episodes.toUI() =
    EpisodesUI(links?.toUI())