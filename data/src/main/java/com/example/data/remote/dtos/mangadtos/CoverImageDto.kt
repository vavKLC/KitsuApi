package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.CoverImage
import com.google.gson.annotations.SerializedName

data class CoverImageDto(
    @SerializedName("tiny")
    val tiny: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("large")
    val large: String?,
    @SerializedName("original")
    val original: String?,
    @SerializedName("meta")
    val meta: MetaXDto?
)

fun CoverImageDto.toDomain() =
    CoverImage(tiny, small, large, original, meta?.toDomain())