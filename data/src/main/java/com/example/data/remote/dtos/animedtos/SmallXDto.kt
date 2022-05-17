package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.SmallX
import com.google.gson.annotations.SerializedName

data class SmallXDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun SmallXDto.toDomain() =
    SmallX(width, height)