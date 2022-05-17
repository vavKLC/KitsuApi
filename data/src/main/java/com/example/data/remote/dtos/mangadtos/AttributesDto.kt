package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.*
import com.google.gson.annotations.SerializedName

data class AttributesDto(
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("synopsis")
    val synopsis: String?,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int?,
    @SerializedName("titles")
    val titles: TitlesDto?,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String?,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: Any?,
    @SerializedName("averageRating")
    val averageRating: String?,
    @SerializedName("ratingFrequencies")
    val ratingFrequencies: RatingFrequenciesDto?,
    @SerializedName("userCount")
    val userCount: Int?,
    @SerializedName("favoritesCount")
    val favoritesCount: Int?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("endDate")
    val endDate: Any?,
    @SerializedName("popularityRank")
    val popularityRank: Int?,
    @SerializedName("ratingRank")
    val ratingRank: Int?,
    @SerializedName("ageRating")
    val ageRating: String?,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String?,
    @SerializedName("subtype")
    val subtype: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("tba")
    val tba: String?,
    @SerializedName("posterImage")
    val posterImage: PosterImageDto?,
    @SerializedName("coverImage")
    val coverImage: CoverImageDto?,
    @SerializedName("chapterCount")
    val chapterCount: Any?,
    @SerializedName("volumeCount")
    val volumeCount: Int?,
    @SerializedName("serialization")
    val serialization: String?,
    @SerializedName("mangaType")
    val mangaType: String?
)

fun AttributesDto.toDomain() =
    Attributes(
        createdAt,
        updatedAt,
        slug,
        synopsis,
        coverImageTopOffset,
        titles?.toDomain(),
        canonicalTitle,
        abbreviatedTitles,
        averageRating,
        ratingFrequencies?.toDomain(),
        userCount,
        favoritesCount,
        startDate,
        endDate,
        popularityRank,
        ratingRank,
        ageRating,
        ageRatingGuide,
        subtype,
        status,
        tba,
        posterImage?.toDomain(),
        coverImage?.toDomain(),
        chapterCount,
        volumeCount,
        serialization,
        mangaType
    )