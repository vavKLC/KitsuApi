package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksX


data class LinksXUI(
    val self: String?,
    val related: String?
)

fun LinksX.toUI() =
    LinksXUI(self, related)