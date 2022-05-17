package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksX
import com.google.gson.annotations.SerializedName

data class LinksXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)

fun LinksXDto.toDomain() =
    LinksX(self, related)