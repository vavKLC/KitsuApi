package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXX


data class LinksXXXXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXXXX.toUI() =
    LinksXXXXXXXXXXUI(self, related)