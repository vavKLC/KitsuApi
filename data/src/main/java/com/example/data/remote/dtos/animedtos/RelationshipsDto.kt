package com.example.data.remote.dtos.animedtos


import com.example.domain.models.anime.Relationships
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
    @SerializedName("episodes")
    val episodes: EpisodesDto?,
    @SerializedName("streamingLinks")
    val streamingLinks: StreamingLinksDto?,
    @SerializedName("animeProductions")
    val animeProductions: AnimeProductionsDto?,
    @SerializedName("animeCharacters")
    val animeCharacters: AnimeCharactersDto?,
    @SerializedName("animeStaff")
    val animeStaff: AnimeStaffDto?
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
        episodes?.toDomain(),
        streamingLinks?.toDomain(),
        animeProductions?.toDomain(),
        animeCharacters?.toDomain(),
        animeStaff?.toDomain()
    )