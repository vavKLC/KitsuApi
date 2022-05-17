package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.MediaRelationships


data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI?
)

fun MediaRelationships.toUI() =
    MediaRelationshipsUI(links?.toUI())