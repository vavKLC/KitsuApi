package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXXXDto.toDomain() =
    LinksXXXXXXXX(self, related)