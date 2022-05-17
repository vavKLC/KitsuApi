package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXX


data class LinksXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXX.toUI() =
    LinksXXXXUI(self, related)