package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Attributes


data class AttributesUI(
    val createdAt: String?,
    val updatedAt: String?,
    val slug: String?,
    val synopsis: String?,
    val coverImageTopOffset: Int?,
    val titles: TitlesUI?,
    val canonicalTitle: String?,
    val abbreviatedTitles: List<String>?,
    val averageRating: String?,
    val ratingFrequencies: RatingFrequenciesUI?,
    val userCount: Int?,
    val favoritesCount: Int?,
    val startDate: String?,
    val endDate: String?,
    val popularityRank: Int?,
    val ratingRank: Int?,
    val ageRating: String?,
    val ageRatingGuide: String?,
    val subtype: String?,
    val status: String?,
    val tba: String?,
    val posterImage: PosterImageUI?,
    val coverImage: CoverImageUI?,
    val episodeCount: Int?,
    val episodeLength: Int?,
    val youtubeVideoId: String?,
    val showType: String?,
    val nsfw: Boolean?
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
        episodeCount,
        episodeLength,
        youtubeVideoId,
        showType,
        nsfw
    )