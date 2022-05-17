package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Links


data class LinksUI(
    val self: String?
)

fun Links.toUI() =
    LinksUI(self)