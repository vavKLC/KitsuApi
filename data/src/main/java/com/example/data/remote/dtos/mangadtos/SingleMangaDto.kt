package com.example.data.remote.dtos.mangadtos

import com.example.domain.models.manga.SingleManga
import com.google.gson.annotations.SerializedName

data class SingleMangaDto(
    @SerializedName("data")
    val data: DataDto
)

fun SingleMangaDto.toDomain() =
    SingleManga(data.toDomain())