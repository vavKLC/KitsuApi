package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXX


data class LinksXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXX.toUI() =
    LinksXXXXXXXUI(self, related)