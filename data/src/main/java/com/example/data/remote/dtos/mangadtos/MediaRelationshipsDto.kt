package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.MediaRelationships
import com.google.gson.annotations.SerializedName

data class MediaRelationshipsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXDto?
)

fun MediaRelationshipsDto.toDomain() =
    MediaRelationships(links?.toDomain())
