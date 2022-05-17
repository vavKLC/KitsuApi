package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Genres
import com.google.gson.annotations.SerializedName

data class GenresDto(
    @SerializedName("links")
    val links: LinksXDto?
)

fun GenresDto.toDomain() =
    Genres(links?.toDomain())