package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXX


data class LinksXXUI(
    val self: String?,
    val related: String?
)

fun LinksXX.toUI() =
    LinksXXUI(self, related)