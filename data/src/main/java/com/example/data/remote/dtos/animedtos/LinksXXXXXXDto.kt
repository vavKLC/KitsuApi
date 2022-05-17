package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXXDto.toDomain() =
    LinksXXXXXX(self, related)