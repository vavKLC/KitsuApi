package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXX
import com.google.gson.annotations.SerializedName

data class LinksXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXXDto.toDomain() =
    LinksXX(self, related)