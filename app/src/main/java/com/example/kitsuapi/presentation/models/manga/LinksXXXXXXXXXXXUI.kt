package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.LinksXXXXXXXXXXX


data class LinksXXXXXXXXXXXUI(
    val first: String?,
    val prev: String?,
    val next: String?,
    val last: String?
)

fun LinksXXXXXXXXXXX.toUI() =
    LinksXXXXXXXXXXXUI(first, prev, next, last)