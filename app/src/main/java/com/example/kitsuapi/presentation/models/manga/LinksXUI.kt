package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksX


data class LinksXUI(
    val self: String?,
    val related: String?
)

fun LinksX.toUI() =
    LinksXUI(self, related)