package com.example.data.remote.apiservice

import com.example.data.remote.dtos.mangadtos.MangaDto
import com.example.data.remote.dtos.mangadtos.SingleMangaDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MangaApiService {
    @GET("manga")
    suspend fun fetchManga(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): MangaDto

    @GET("manga/{id}")
    suspend fun fetchDetailManga(@Path("id") id: String): SingleMangaDto
}