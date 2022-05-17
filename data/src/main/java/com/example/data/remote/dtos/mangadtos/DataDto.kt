package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Data
import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String?,
    @SerializedName("links")
    val links: LinksDto?,
    @SerializedName("attributes")
    val attributes: AttributesDto?,
    @SerializedName("relationships")
    val relationships: RelationshipsDto?
)

fun DataDto.toDomain() =
    Data(id, type, links?.toDomain(), attributes?.toDomain(), relationships?.toDomain())