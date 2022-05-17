package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.AnimeProductions
import com.google.gson.annotations.SerializedName

data class AnimeProductionsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXDto?
)

fun AnimeProductionsDto.toDomain() =
    AnimeProductions(links?.toDomain())