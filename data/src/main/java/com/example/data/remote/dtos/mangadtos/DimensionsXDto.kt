package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.DimensionsX
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