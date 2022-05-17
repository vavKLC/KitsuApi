package com.example.kitsuapi.presentation.ui.fragments.auth

import com.example.domain.usecase.SignUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.models.auth.TokenUI
import com.example.kitsuapi.presentation.models.auth.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val sign: SignUseCase
) : BaseViewModel() {
    private val _signInState = mutableUIStateFlow<TokenUI>()
    val signInState = _signInState.asStateFlow()

    fun signIn(username: String, password: String) =
        sign(username, password).collectRequest(_signInState) { it.toUI() }
}