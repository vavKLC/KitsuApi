package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Episodes
import com.google.gson.annotations.SerializedName

data class EpisodesDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXDto?
)

fun EpisodesDto.toDomain() =
    Episodes(links?.toDomain())