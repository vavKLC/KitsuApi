package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.StreamingLinks


data class StreamingLinksUI(
    val links: LinksXXXXXXXXXUI?
)

fun StreamingLinks.toUI() =
    StreamingLinksUI(links?.toUI())