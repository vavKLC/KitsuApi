package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Genres
import com.google.gson.annotations.SerializedName

data class GenresDto(
    @SerializedName("links")
    val links: LinksXDto?
)

fun GenresDto.toDomain() =
    Genres(links?.toDomain())