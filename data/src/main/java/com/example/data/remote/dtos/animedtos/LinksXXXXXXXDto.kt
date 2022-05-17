package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXDto(
    @SerializedName("self")
    val self: String?,
    @SerializedName("related")
    val related: String?
)
fun LinksXXXXXXXDto.toDomain() =
    LinksXXXXXXX(self, related)