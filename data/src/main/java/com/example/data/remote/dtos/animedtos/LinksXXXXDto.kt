package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXXXDto.toDomain() =
    LinksXXXX(self, related)