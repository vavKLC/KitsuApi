package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXXXXXXDto.toDomain() =
    LinksXXXXXXXXXXX(self, related)