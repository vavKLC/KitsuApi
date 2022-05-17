package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.MangaStaff


data class MangaStaffUI(
    val links: LinksXXXXXXXXXXUI?
)

fun MangaStaff.toUI() =
    MangaStaffUI(links?.toUI())