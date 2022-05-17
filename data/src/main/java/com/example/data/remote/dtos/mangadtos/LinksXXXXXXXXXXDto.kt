package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXXXXXDto.toDomain() =
    LinksXXXXXXXXXX(self, related)