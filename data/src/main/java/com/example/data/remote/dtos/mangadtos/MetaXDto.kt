package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.MetaX
import com.google.gson.annotations.SerializedName

data class MetaXDto(
    @SerializedName("dimensions")
    val dimensions: DimensionsXDto?
)

fun MetaXDto.toDomain() =
    MetaX(dimensions?.toDomain())
