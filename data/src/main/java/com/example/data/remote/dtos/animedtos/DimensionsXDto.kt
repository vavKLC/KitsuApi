package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.DimensionsX
import com.google.gson.annotations.SerializedName

data class DimensionsXDto(
    @SerializedName("tiny")
    val tiny: TinyXDto?,
    @SerializedName("small")
    val small: SmallXDto?,
    @SerializedName("large")
    val large: LargeXDto?
)

fun DimensionsXDto.toDomain() =
    DimensionsX(tiny?.toDomain(), small?.toDomain(), large?.toDomain())