package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.MangaCharacters
import com.google.gson.annotations.SerializedName

data class MangaCharactersDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXDto?
)

fun MangaCharactersDto.toDomain() =
    MangaCharacters(links?.toDomain())