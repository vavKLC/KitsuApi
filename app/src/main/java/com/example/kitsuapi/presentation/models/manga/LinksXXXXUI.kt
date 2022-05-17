package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXX


data class LinksXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXX.toUI() =
    LinksXXXXUI(self, related)