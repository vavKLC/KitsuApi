package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Mappings
import com.google.gson.annotations.SerializedName

data class MappingsDto(
    @SerializedName("links")
    val links: LinksXXXXXDto?
)

fun MappingsDto.toDomain() =
    Mappings(links?.toDomain())
