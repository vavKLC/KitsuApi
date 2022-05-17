package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXX


data class LinksXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXX.toUI() =
    LinksXXXXXXXUI(self, related)