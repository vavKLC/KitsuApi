package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.MetaXX


data class MetaXXUI(
    val count: Int?
)

fun MetaXX.toUI() =
    MetaXXUI(count)