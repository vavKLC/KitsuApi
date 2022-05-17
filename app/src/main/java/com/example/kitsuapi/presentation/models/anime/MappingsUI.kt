package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Mappings


data class MappingsUI(
    val links: LinksXXXXXUI?
)

fun Mappings.toUI() =
    MappingsUI(links?.toUI())