package com.example.domain.models.manga



data class Data(
    val id: String,
    val type: String?,
    val links: Links?,
    val attributes: Attributes?,
    val relationships: Relationships?
)