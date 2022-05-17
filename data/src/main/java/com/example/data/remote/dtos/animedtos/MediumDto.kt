package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Medium
import com.google.gson.annotations.SerializedName

data class MediumDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun MediumDto.toDomain() =
    Medium(width, height)