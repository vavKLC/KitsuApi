package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXX


data class LinksXXXXXXXXUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXX.toUI() =
    LinksXXXXXXXXUI(self, related)