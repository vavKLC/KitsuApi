package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Reviews


data class ReviewsUI(
    val links: LinksXXXXXXUI?
)

fun Reviews.toUI() =
    ReviewsUI(links?.toUI())