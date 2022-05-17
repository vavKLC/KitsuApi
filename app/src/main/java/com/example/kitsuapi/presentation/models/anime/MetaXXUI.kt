package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.MetaXX


data class MetaXXUI(
    val count: Int?
)

fun MetaXX.toUI() =
    MetaXXUI(count)