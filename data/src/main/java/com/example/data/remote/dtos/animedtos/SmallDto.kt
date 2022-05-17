package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Small
import com.google.gson.annotations.SerializedName

data class SmallDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun SmallDto.toDomain() =
    Small(width, height)