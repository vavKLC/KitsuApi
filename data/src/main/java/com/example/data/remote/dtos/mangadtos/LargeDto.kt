package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Large
import com.google.gson.annotations.SerializedName

data class LargeDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun LargeDto.toDomain() =
    Large(width, height)