package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Reviews
import com.google.gson.annotations.SerializedName

data class ReviewsDto(
    @SerializedName("links")
    val links: LinksXXXXXXDto?
)

fun ReviewsDto.toDomain() =
    Reviews(links?.toDomain())