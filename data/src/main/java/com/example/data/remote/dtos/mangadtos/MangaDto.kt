package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Manga
import com.google.gson.annotations.SerializedName

data class MangaDto(
    @SerializedName("data")
    val data: List<DataDto>,
    @SerializedName("meta")
    val meta: MetaXXDto?,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXDto?
)

fun MangaDto.toDomain() =
    Manga(data.map { it.toDomain() }, meta?.toDomain(), links?.toDomain())