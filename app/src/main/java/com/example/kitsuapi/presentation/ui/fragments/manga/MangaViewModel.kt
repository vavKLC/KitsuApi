package com.example.kitsuapi.presentation.ui.fragments.manga

import com.example.data.repositories.MangaRepositoryImpl
import com.example.kitsuapi.presentation.base.BaseViewModel
import com.example.kitsuapi.presentation.models.manga.toUI
import javax.inject.Inject

class MangaViewModel @Inject constructor(
    private val service: MangaRepositoryImpl
) : BaseViewModel() {
    fun fetchManga() = service.fetchPagedManga().collectPagingRequest {
        it.toUI() }
}