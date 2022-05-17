package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXXXX


data class LinksXXXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXXX.toUI() =
    LinksXXXXXXXXXUI(self, related)