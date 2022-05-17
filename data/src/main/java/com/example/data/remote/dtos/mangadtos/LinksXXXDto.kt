package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXDto.toDomain() =
    LinksXXX(self, related)