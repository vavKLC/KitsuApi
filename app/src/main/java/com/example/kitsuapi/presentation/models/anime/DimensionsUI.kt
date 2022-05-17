package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Dimensions


data class DimensionsUI(
    val tiny: TinyUI?,
    val small: SmallUI?,
    val medium: MediumUI?,
    val large: LargeUI?
)

fun Dimensions.toUI() =
    DimensionsUI(tiny?.toUI(), small?.toUI(), medium?.toUI(), large?.toUI())