package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.MetaXX
import com.google.gson.annotations.SerializedName

data class MetaXXDto(
    @SerializedName("count")
    val count: Int?
)

fun MetaXXDto.toDomain() =
    MetaXX(count)