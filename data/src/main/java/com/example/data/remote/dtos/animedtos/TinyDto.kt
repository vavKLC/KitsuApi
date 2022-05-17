package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Tiny
import com.google.gson.annotations.SerializedName

data class TinyDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun TinyDto.toDomain() =
    Tiny(width, height)