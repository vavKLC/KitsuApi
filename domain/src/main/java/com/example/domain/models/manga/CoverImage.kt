package com.example.domain.models.manga



data class CoverImage(
    val tiny: String?,
    val small: String?,
    val large: String?,
    val original: String?,
    val meta: MetaX?
)