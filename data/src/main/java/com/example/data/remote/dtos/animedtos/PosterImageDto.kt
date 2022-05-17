package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageDto(
    @SerializedName("tiny")
    val tiny: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("medium")
    val medium: String?,
    @SerializedName("large")
    val large: String?,
    @SerializedName("original")
    val original: String?,
    @SerializedName("meta")
    val meta: MetaDto?
)

fun PosterImageDto.toDomain() =
    PosterImage(tiny, small, medium, large, original, meta?.toDomain())