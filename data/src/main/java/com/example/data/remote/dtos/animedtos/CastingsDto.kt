package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Castings
import com.google.gson.annotations.SerializedName

data class CastingsDto(
    @SerializedName("links")
    val links: LinksXXXDto?
)

fun CastingsDto.toDomain() =
    Castings(links?.toDomain())