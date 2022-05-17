package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Attributes


data class AttributesUI(
    val createdAt: String?,
    val updatedAt: String?,
    val slug: String?,
    val synopsis: String?,
    val coverImageTopOffset: Int?,
    val titlesUI: TitlesUI?,
    val canonicalTitle: String?,
    val abbreviatedTitles: Any?,
    val averageRating: String?,
    val ratingFrequenciesUI: RatingFrequenciesUI?,
    val userCount: Int?,
    val favoritesCount: Int?,
    val startDate: String?,
    val endDate: Any?,
    val popularityRank: Int?,
    val ratingRank: Int?,
    val ageRating: String?,
    val ageRatingGuide: String?,
    val subtype: String?,
    val status: String?,
    val tba: String?,
    val posterImageUI: PosterImageUI?,
    val coverImageUI: CoverImageUI?,
    val chapterCount: Any?,
    val volumeCount: Int?,
    val serialization: String?,
    val mangaType: String?
)

fun Attributes.toUI() =
    AttributesUI(
        createdAt,
        updatedAt,
        slug,
        synopsis,
        coverImageTopOffset,
        titles?.toUI(),
        canonicalTitle,
        abbreviatedTitles,
        averageRating,
        ratingFrequencies?.toUI(),
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
        posterImage?.toUI(),
        coverImage?.toUI(),
        chapterCount,
        volumeCount,
        serialization,
        mangaType
    )