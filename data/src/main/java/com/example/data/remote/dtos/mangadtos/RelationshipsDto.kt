package com.example.data.remote.dtos.mangadtos


import com.example.domain.models.manga.Relationships
import com.google.gson.annotations.SerializedName

data class RelationshipsDto(
    @SerializedName("genres")
    val genres: GenresDto?,
    @SerializedName("categories")
    val categories: CategoriesDto?,
    @SerializedName("castings")
    val castings: CastingsDto?,
    @SerializedName("installments")
    val installments: InstallmentsDto?,
    @SerializedName("mappings")
    val mappings: MappingsDto?,
    @SerializedName("reviews")
    val reviews: ReviewsDto?,
    @SerializedName("mediaRelationships")
    val mediaRelationships: MediaRelationshipsDto?,
    @SerializedName("chapters")
    val chapters: ChaptersDto?,
    @SerializedName("mangaCharacters")
    val mangaCharacters: MangaCharactersDto?,
    @SerializedName("mangaStaff")
    val mangaStaff: MangaStaffDto?
)

fun RelationshipsDto.toDomain() =
    Relationships(
        genres?.toDomain(),
        categories?.toDomain(),
        castings?.toDomain(),
        installments?.toDomain(),
        mappings?.toDomain(),
        reviews?.toDomain(),
        mediaRelationships?.toDomain(),
        chapters?.toDomain(),
        mangaCharacters?.toDomain(),
        mangaStaff?.toDomain()
    )