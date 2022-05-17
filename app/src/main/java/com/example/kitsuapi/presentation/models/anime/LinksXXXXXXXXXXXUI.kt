package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXX


data class LinksXXXXXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXXXXX.toUI() =
    LinksXXXXXXXXXXXUI(self, related)