package com.example.domain.models.manga


data class PosterImage(
    val tiny: String?,
    val small: String?,
    val medium: String?,
    val large: String?,
    val original: String?,
    val meta: Meta?
)