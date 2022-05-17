package com.example.domain.models.manga


data class Attributes(
    val createdAt: String?,
    val updatedAt: String?,
    val slug: String?,
    val synopsis: String?,
    val coverImageTopOffset: Int?,
    val titles: Titles?,
    val canonicalTitle: String?,
    val abbreviatedTitles: Any?,
    val averageRating: String?,
    val ratingFrequencies: RatingFrequencies?,
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
    val posterImage: PosterImage?,
    val coverImage: CoverImage?,
    val chapterCount: Any?,
    val volumeCount: Int?,
    val serialization: String?,
    val mangaType: String?
)