package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Installments


data class InstallmentsUI(
    val links: LinksXXXXUI?
)

fun Installments.toUI() =
    InstallmentsUI(links?.toUI())