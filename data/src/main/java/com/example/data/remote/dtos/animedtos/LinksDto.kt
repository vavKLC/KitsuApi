package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Links
import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("self")
    val self: String?
)

fun LinksDto.toDomain() =
    Links(self)