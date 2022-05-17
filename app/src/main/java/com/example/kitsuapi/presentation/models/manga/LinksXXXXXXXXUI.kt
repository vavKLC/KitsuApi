package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXXX


data class LinksXXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXX.toUI() =
    LinksXXXXXXXXUI(self, related)