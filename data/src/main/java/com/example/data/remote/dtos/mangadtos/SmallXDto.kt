package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.SmallX
import com.google.gson.annotations.SerializedName

data class SmallXDto(
    @SerializedName("width")
    val width: Any?,
    @SerializedName("height")
    val height: Any?
)

fun SmallXDto.toDomain() =
    SmallX(width, height)