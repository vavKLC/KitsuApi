package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXXXXDto.toDomain() =
    LinksXXXXXXXXX(self, related)