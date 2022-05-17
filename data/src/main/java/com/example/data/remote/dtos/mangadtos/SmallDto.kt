package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Small
import com.google.gson.annotations.SerializedName

data class SmallDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun SmallDto.toDomain() =
    Small(width, height)