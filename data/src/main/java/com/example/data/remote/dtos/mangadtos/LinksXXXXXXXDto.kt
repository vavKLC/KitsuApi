package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXXDto.toDomain() =
    LinksXXXXXXX(self, related)