package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXXXXX


data class LinksXXXXXXXXXXUI(
    val self: String?,
    val related: String?
)

fun LinksXXXXXXXXXX.toUI() =
    LinksXXXXXXXXXXUI(self, related)