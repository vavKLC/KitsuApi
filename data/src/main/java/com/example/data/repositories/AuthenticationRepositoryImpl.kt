package com.example.data.repositories

import com.example.data.remote.apiservice.AuthenticationApiService
import com.example.data.remote.dtos.authdtos.AuthDto
import com.example.data.remote.dtos.authdtos.toDomain
import com.example.data.remote.local.PreferencesHelper
import com.example.data.repositories.base.BaseRepository
import com.example.domain.models.auth.Token
import com.example.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val service: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {
    override fun authenticate(
        username: String,
        password: String
    ) = doRequest(this::saveToken) {
        service.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(token: Token) {
        preferencesHelper.accessToken = token.accessToken
        preferencesHelper.refreshToken = token.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}