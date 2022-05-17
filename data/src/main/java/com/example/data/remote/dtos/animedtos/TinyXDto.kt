package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.TinyX
import com.google.gson.annotations.SerializedName

data class TinyXDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun TinyXDto.toDomain() =
    TinyX(width, height)