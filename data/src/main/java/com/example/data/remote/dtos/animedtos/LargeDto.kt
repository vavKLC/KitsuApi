package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Large
import com.google.gson.annotations.SerializedName

data class LargeDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun LargeDto.toDomain() =
    Large(width, height)