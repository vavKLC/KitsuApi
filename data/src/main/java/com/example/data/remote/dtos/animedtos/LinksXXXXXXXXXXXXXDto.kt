package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LinksXXXXXXXXXXXXX
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXXXDto(
    @SerializedName("first")
    val first: String?,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String?,
    @SerializedName("last")
    val last: String?
)

fun LinksXXXXXXXXXXXXXDto.toDomain() =
    LinksXXXXXXXXXXXXX(first, prev, next, last)