package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.DimensionsX


data class DimensionsXUI(
    val tiny: TinyXUI?,
    val small: SmallXUI?,
    val large: LargeXUI?
)

fun DimensionsX.toUI() =
    DimensionsXUI(tiny?.toUI(), small?.toUI(), large?.toUI())