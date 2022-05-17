package com.example.data.remote.dtos.animedtos

import com.example.domain.models.anime.SingleAnime
import com.google.gson.annotations.SerializedName

data class SingleAnimeDto (
    @SerializedName("data")
    val data: com.example.data.remote.dtos.animedtos.DataDto
)

fun SingleAnimeDto.toDomain() =
    SingleAnime(data.toDomain())