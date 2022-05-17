package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.TinyX
import com.google.gson.annotations.SerializedName

data class TinyXDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun TinyXDto.toDomain() =
    TinyX(width, height)