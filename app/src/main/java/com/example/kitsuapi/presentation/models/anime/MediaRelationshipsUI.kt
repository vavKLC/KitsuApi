package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.MediaRelationships


data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI?
)

fun MediaRelationships.toUI() =
    MediaRelationshipsUI(links?.toUI())