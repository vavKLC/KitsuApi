package com.example.kitsuapi.presentation.models.auth

import com.example.domain.models.auth.Token

data class TokenUI(
    val accessToken: String,
    val createdAt: Long,
    val expiresIn: Int,
    val refreshToken: String,
    val scope: String,
    val tokenType: String
)

fun Token.toUI() =
    TokenUI(accessToken, createdAt, expiresIn, refreshToken, scope, tokenType)