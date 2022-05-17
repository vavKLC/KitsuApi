package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXX


data class LinksXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXX.toUI() =
    LinksXXXXXUI(self, related)