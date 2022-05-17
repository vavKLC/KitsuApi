package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXX


data class LinksXXUI(
    val self: String?,
    val related: String?
)

fun LinksXX.toUI() =
    LinksXXUI(self, related)