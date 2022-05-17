package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Meta
import com.google.gson.annotations.SerializedName

data class MetaDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsDto?
)

fun MetaDto.toDomain() =
    Meta(dimensions?.toDomain())
