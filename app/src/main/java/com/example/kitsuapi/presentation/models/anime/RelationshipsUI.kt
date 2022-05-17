package com.example.kitsuapi.presentation.models.anime

import com.example.domain.models.anime.Relationships


data class RelationshipsUI(
    val genresUI: GenresUI?,
    val categories: CategoriesUI?,
    val castings: CastingsUI?,
    val installmentsUI: InstallmentsUI?,
    val mappingsUI: MappingsUI?,
    val reviewsUI: ReviewsUI?,
    val mediaRelationshipsUI: MediaRelationshipsUI?,
    val episodesUI: EpisodesUI?,
    val streamingLinksUI: StreamingLinksUI?,
    val animeProductions: AnimeProductionsUI?,
    val animeCharacters: AnimeCharactersUI?,
    val animeStaff: AnimeStaffUI?
)

fun Relationships.toUI() =
    RelationshipsUI(
        genres?.toUI(),
        categories?.toUI(),
        castings?.toUI(),
        installments?.toUI(),
        mappings?.toUI(),
        reviews?.toUI(),
        mediaRelationships?.toUI(),
        episodes?.toUI(),
        streamingLinks?.toUI(),
        animeProductions?.toUI(),
        animeCharacters?.toUI(),
        animeStaff?.toUI()
    )