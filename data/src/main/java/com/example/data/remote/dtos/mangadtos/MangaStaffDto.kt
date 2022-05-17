package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.MangaStaff
import com.google.gson.annotations.SerializedName

data class MangaStaffDto(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXDto?
)

fun MangaStaffDto.toDomain() =
    MangaStaff(links?.toDomain())