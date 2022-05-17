package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXXXX


data class LinksXXXXXXXXXXXXXUI(
    val first: String?,
    val prev: String?,
    val next: String?,
    val last: String?
)

fun LinksXXXXXXXXXXXXX.toUI() =
    LinksXXXXXXXXXXXXXUI(first, prev, next, last)