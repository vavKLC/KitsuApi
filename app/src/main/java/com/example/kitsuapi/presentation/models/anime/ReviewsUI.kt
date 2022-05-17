package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Reviews


data class ReviewsUI(
    val links: LinksXXXXXXUI?
)

fun Reviews.toUI() =
    ReviewsUI(links?.toUI())