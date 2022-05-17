package com.example.kitsuapi.presentation.ui.fragments.manga.detail

import com.example.domain.usecase.FetchDetailMangaUseCase
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.models.manga.SingleMangaUI
import com.example.kitsuapi.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MangaDetailViewModel @Inject constructor(
    private val fetchDetailMangaUseCase: FetchDetailMangaUseCase
) : BaseViewModel() {

    private val _detailMangaState = mutableUIStateFlow<SingleMangaUI>()
    var detailMangaState = _detailMangaState.asStateFlow()

    fun fetchDetailManga(id: String) =
        fetchDetailMangaUseCase(id).collectRequest(_detailMangaState) { it.toUI() }
}