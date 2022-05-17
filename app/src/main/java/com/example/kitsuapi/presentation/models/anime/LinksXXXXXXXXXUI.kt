package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXX


data class LinksXXXXXXXXXUI(
    val self: String?,
    val related: String?
)
fun LinksXXXXXXXXX.toUI() =
    LinksXXXXXXXXXUI(self, related)