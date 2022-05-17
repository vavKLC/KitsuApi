package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXXX


data class LinksXXXXXXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXXXXXX.toUI() =
    LinksXXXXXXXXXXXXUI(self, related)