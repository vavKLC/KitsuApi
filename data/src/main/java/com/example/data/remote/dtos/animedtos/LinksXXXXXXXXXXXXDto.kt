package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXXXXXXXDto.toDomain() =
    LinksXXXXXXXXXXXX(self, related)