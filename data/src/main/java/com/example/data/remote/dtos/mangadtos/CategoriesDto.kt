package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Categories
import com.google.gson.annotations.SerializedName

data class CategoriesDto(
    @SerializedName("links")
    val links: LinksXXDto?
)

fun CategoriesDto.toDomain() =
    Categories(links?.toDomain())