package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Links


data class LinksUI(
    val self: String?
)

fun Links.toUI() =
    LinksUI(self)