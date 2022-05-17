package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Meta
import com.google.gson.annotations.SerializedName

data class MetaDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsDto?
)

fun MetaDto.toDomain() =
    Meta(dimensions?.toDomain())
