package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Titles
import com.google.gson.annotations.SerializedName

data class TitlesDto(
    @SerializedName("en")
    val en: String?,
    @SerializedName("en_jp")
    val enJp: String?,
    @SerializedName("ja_jp")
    val jaJp: String?
)

fun TitlesDto.toDomain() =
    Titles(en, enJp, jaJp)