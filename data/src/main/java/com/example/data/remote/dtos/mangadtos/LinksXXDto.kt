package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXX
import com.google.gson.annotations.SerializedName

data class LinksXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXDto.toDomain() =
    LinksXX(self, related)