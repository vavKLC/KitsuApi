package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Mappings
import com.google.gson.annotations.SerializedName

data class MappingsDto(
    @SerializedName("links")
    val links: LinksXXXXXDto?
)

fun MappingsDto.toDomain() =
    Mappings(links?.toDomain())