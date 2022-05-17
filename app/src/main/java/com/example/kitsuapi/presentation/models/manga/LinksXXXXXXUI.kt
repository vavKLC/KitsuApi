package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXX


data class LinksXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXX.toUI() =
    LinksXXXXXXUI(self, related)