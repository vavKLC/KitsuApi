package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXDto.toDomain() =
    LinksXXXXX(self, related)