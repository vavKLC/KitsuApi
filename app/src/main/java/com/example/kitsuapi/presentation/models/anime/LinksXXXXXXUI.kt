package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXX


data class LinksXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXX.toUI() =
    LinksXXXXXXUI(self, related)