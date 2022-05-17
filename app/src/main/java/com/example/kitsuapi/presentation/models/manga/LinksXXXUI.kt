package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXX


data class LinksXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXX.toUI() =
    LinksXXXUI(self, related)