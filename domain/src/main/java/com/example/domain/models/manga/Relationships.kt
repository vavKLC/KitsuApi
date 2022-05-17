package com.example.domain.models.manga



data class Relationships(
    val genres: Genres?,
    val categories: Categories?,
    val castings: Castings?,
    val installments: Installments?,
    val mappings: Mappings?,
    val reviews: Reviews?,
    val mediaRelationships: MediaRelationships?,
    val chapters: Chapters?,
    val mangaCharacters: MangaCharacters?,
    val mangaStaff: MangaStaff?
)