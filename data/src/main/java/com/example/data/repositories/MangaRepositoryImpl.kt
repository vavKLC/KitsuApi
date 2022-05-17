package com.example.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.data.remote.apiservice.MangaApiService
import com.example.data.remote.dtos.mangadtos.toDomain
import com.example.data.remote.pagingsources.MangaPagingSource
import com.example.data.repositories.base.BaseRepository
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val service: MangaApiService
) : BaseRepository(), MangaRepository {


    fun fetchPagedManga() = Pager(
        PagingConfig(
            pageSize = 20,
            initialLoadSize = 10
        )
    ) { MangaPagingSource(service) }.flow.map { data -> data.map { it.toDomain() } }

    override fun fetchMangaDetails(id: String) = doRequest {
        service.fetchDetailManga(id).toDomain()
    }

}