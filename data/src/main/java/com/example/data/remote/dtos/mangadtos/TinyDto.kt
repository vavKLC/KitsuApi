package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Tiny
import com.google.gson.annotations.SerializedName

data class TinyDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun TinyDto.toDomain() =
    Tiny(width, height)