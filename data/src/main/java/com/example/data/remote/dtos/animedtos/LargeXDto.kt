package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.LargeX
import com.google.gson.annotations.SerializedName

data class LargeXDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun LargeXDto.toDomain() =
    LargeX(width, height)