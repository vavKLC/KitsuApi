package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Medium
import com.google.gson.annotations.SerializedName

data class MediumDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun MediumDto.toDomain() =
    Medium(width, height)