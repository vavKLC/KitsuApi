package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Anime
import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("data")
    val data: List<DataDto>,
    @SerializedName("meta")
    val meta: MetaXXDto?,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXXDto?
)

fun AnimeDto.toDomain() =
    Anime(data.map { it.toDomain() }, meta?.toDomain(), links?.toDomain())



