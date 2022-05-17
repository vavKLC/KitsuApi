package com.example.kitsuapi.presentation.models.manga

import com.example.domain.models.manga.Relationships


data class RelationshipsUI(
    val genresUI: GenresUI?,
    val categoriesUI: CategoriesUI?,
    val castingsUI: CastingsUI?,
    val installmentsUI: InstallmentsUI?,
    val mappingsUI: MappingsUI?,
    val reviewsUI: ReviewsUI?,
    val mediaRelationshipsUI: MediaRelationshipsUI?,
    val chaptersUI: ChaptersUI?,
    val mangaCharactersUI: MangaCharactersUI?,
    val mangaStaffUI: MangaStaffUI?
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
        chapters?.toUI(),
        mangaCharacters?.toUI(),
        mangaStaff?.toUI()
    )