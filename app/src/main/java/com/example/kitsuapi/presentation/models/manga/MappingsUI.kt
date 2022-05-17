package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Mappings


data class MappingsUI(
    val links: LinksXXXXXUI?
)

fun Mappings.toUI() =
    MappingsUI(links?.toUI())