package com.example.kitsuapi.presentation.ui.fragments.anime.detail

import com.example.domain.usecase.FetchDetailAnimeUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.models.anime.SingleAnimeUI
import com.example.kitsuapi.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeDetailViewModel @Inject constructor(
    private val fetchDetailAnimeUseCase: FetchDetailAnimeUseCase
) : BaseViewModel() {
    private val _singleAnimeState = mutableUIStateFlow<SingleAnimeUI>()
    var singleAnimeState = _singleAnimeState.asStateFlow()


    fun fetchSingleAnime(id: String) =
        fetchDetailAnimeUseCase(id).collectRequest(_singleAnimeState) { it.toUI() }
}