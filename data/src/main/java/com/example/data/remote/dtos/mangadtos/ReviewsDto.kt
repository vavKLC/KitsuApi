package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Reviews
import com.google.gson.annotations.SerializedName

data class ReviewsDto(
    @SerializedName("links")
    val links: LinksXXXXXXDto?
)

fun ReviewsDto.toDomain() =
    Reviews(links?.toDomain())