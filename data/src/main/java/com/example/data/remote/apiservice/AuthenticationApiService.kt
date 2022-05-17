package com.example.data.remote.apiservice

import com.example.data.remote.dtos.authdtos.AuthDto
import com.example.data.remote.dtos.authdtos.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {
    @POST("token")
    suspend fun authenticate(
        @Body authDto: AuthDto
    ): TokenDto

}