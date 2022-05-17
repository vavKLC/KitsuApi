package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.AnimeStaff

data class AnimeStaffUI(
    val links: LinksXXXXXXXXXXXXUI?
)

fun AnimeStaff.toUI() =
    AnimeStaffUI(links?.toUI())