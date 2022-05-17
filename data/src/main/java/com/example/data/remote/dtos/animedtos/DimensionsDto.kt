package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.*
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