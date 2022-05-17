package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.MediaRelationships
import com.google.gson.annotations.SerializedName

data class MediaRelationshipsDto(
    @SerializedName("links")
    val links: LinksXXXXXXXDto?
)

fun MediaRelationshipsDto.toDomain() =
    MediaRelationships(links?.toDomain())