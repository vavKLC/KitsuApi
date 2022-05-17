package com.example.domain.usecase

import com.example.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class SignUseCase @Inject constructor(
    private val auth: AuthenticationRepository
) {
    operator fun invoke(username: String, password: String) =
        auth.authenticate(username, password)
}