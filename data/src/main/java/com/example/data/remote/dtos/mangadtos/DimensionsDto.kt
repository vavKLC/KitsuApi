package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Dimensions
import com.google.gson.annotations.SerializedName

data class DimensionsDto(
    @SerializedName("tiny")
    val tiny: TinyDto?,
    @SerializedName("small")
    val small: SmallDto?,
    @SerializedName("medium")
    val medium: MediumDto?,
    @SerializedName("large")
    val large: LargeDto?
)

fun DimensionsDto.toDomain() =
    Dimensions(tiny?.toDomain(), small?.toDomain(), medium?.toDomain(), large?.toDomain())