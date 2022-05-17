package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.AnimeCharacters
import com.google.gson.annotations.SerializedName

data class AnimeCharactersDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXDto?
)
fun AnimeCharactersDto.toDomain() =
    AnimeCharacters(links?.toDomain())
