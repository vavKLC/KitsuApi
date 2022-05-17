package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Dimensions


data class DimensionsUI(
    val tinyUI: TinyUI?,
    val smallUI: SmallUI?,
    val mediumUI: MediumUI?,
    val largeUI: LargeUI?
)

fun Dimensions.toUI() =
    DimensionsUI(tiny?.toUI(), small?.toUI(), medium?.toUI(), large?.toUI())