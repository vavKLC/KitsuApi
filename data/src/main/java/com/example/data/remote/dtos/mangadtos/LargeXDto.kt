package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.LargeX
import com.google.gson.annotations.SerializedName

data class LargeXDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun LargeXDto.toDomain() =
    LargeX(width, height)