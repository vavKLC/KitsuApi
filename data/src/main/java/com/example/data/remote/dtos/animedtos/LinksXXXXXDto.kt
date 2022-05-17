package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXXDto.toDomain() =
    LinksXXXXX(self, related)