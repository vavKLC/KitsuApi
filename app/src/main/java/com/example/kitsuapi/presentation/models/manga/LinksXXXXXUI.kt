package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXX


data class LinksXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXX.toUI() =
    LinksXXXXXUI(self, related)