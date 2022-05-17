package com.example.kitsuapi.presentation.ui.fragments.anime

import com.example.data.repositories.AnimeRepositoryImpl
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPagingAnime().collectPagingRequest {
            it.toUI()
        }

}