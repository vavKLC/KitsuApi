package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.AnimeStaff
import com.google.gson.annotations.SerializedName

data class AnimeStaffDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXDto?
)

fun AnimeStaffDto.toDomain() =
    AnimeStaff(links?.toDomain())