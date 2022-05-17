package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXX


data class LinksXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXX.toUI() =
    LinksXXXUI(self, related)