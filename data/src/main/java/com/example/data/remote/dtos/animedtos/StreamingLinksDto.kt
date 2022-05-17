package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.StreamingLinks
import com.google.gson.annotations.SerializedName

data class StreamingLinksDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXDto?
)

fun StreamingLinksDto.toDomain() =
    StreamingLinks(links?.toDomain())
