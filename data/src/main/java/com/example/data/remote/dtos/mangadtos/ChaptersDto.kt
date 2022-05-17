package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Chapters
import com.google.gson.annotations.SerializedName

data class ChaptersDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXDto?
)

fun ChaptersDto.toDomain() =
    Chapters(links?.toDomain())