package com.example.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.remote.dtos.animedtos.toDomain
import com.example.data.remote.pagingsources.AnimePagingSource
import com.example.data.repositories.base.BaseRepository
import com.example.domain.either.Either
import com.example.domain.models.anime.Anime
import com.example.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val service: AnimeApiService
) : BaseRepository(), AnimeRepository {
    fun fetchPagingAnime() =
        Pager(PagingConfig(pageSize = 20, initialLoadSize = 10)) {
            AnimePagingSource(service)
        }.flow.map { data -> data.map { it.toDomain() } }


    override fun fetchAnimeDetails(id: String) = doRequest {
        service.fetchDetailsAnime(id).toDomain()
    }
}