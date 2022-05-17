package com.example.data.remote.dtos.authdtos

import com.example.domain.models.auth.Token
import com.google.gson.annotations.SerializedName

data class TokenDto(
    @SerializedName("access_token")
    val access_token: String,
    @SerializedName("created_at")
    val createdAt: Long,
    @SerializedName("expires_in")
    val expiresIn: Int,
    @SerializedName("refresh_token")
    val refreshToken: String,
    @SerializedName("scope")
    val scope: String,
    @SerializedName("token_type")
    val tokenType: String
)

fun TokenDto.toDomain() =
    Token(access_token, createdAt, expiresIn, refreshToken, scope, tokenType)