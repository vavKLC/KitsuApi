package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.MetaX
import com.google.gson.annotations.SerializedName

data class MetaXDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsXDto?
)

fun MetaXDto.toDomain() =
    MetaX(dimensions?.toDomain())