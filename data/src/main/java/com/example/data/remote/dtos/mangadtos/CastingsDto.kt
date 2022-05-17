package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Castings
import com.google.gson.annotations.SerializedName

data class CastingsDto(
    @SerializedName("links")
    val links: LinksXXXDto?
)

fun CastingsDto.toDomain() =
    Castings(links?.toDomain())
