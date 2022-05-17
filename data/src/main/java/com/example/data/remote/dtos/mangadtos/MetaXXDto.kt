package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.MetaXX
import com.google.gson.annotations.SerializedName

data class MetaXXDto(
    @SerializedName("count")
    val count: Int?
)

fun MetaXXDto.toDomain() =
    MetaXX(count)