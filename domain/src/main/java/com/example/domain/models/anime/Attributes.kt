package com.example.domain.models.anime


data class Attributes(
    val createdAt: String?,
    val updatedAt: String?,
    val slug: String?,
    val synopsis: String?,
    val coverImageTopOffset: Int?,
    val titles: Titles?,
    val canonicalTitle: String?,
    val abbreviatedTitles: List<String>?,
    val averageRating: String?,
    val ratingFrequencies: RatingFrequencies?,
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
    val posterImage: PosterImage?,
    val coverImage: CoverImage?,
    val episodeCount: Int?,
    val episodeLength: Int?,
    val youtubeVideoId: String?,
    val showType: String?,
    val nsfw: Boolean?
)