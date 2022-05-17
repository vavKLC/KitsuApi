package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Categories
import com.google.gson.annotations.SerializedName

data class CategoriesDto(
    @SerializedName("links")
    val links: LinksXXDto?
)

fun CategoriesDto.toDomain() =
    Categories(links?.toDomain())