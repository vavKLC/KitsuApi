package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Categories


data class CategoriesUI(
    val links: LinksXXUI?
)

fun Categories.toUI() =
    CategoriesUI(links?.toUI())