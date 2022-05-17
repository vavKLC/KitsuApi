package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Installments


data class InstallmentsUI(
    val links: LinksXXXXUI?
)

fun Installments.toUI() =
    InstallmentsUI(links?.toUI())