package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LinksXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXDto(
    @SerializedName("first")
    val first: String?,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String?,
    @SerializedName("last")
    val last: String?
)

fun LinksXXXXXXXXXXXDto.toDomain() =
    LinksXXXXXXXXXXX(first, prev, next, last)