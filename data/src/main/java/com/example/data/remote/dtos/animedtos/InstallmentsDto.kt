package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Installments
import com.google.gson.annotations.SerializedName

data class InstallmentsDto(
    @SerializedName("links")
    val links: LinksXXXXDto?
)

fun InstallmentsDto.toDomain() =
    Installments(links?.toDomain())