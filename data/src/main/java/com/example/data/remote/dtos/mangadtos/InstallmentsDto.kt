package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Installments
import com.google.gson.annotations.SerializedName

data class InstallmentsDto(
    @SerializedName("links")
    val links: LinksXXXXDto?
)

fun InstallmentsDto.toDomain() =
    Installments(links?.toDomain())