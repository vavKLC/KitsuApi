package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Links
import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("self")
    val self: String?
)

fun LinksDto.toDomain() =
    Links(self)