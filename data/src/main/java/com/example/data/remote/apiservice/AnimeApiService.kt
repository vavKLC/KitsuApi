package com.example.data.remote.apiservice

import com.example.data.remote.dtos.animedtos.AnimeDto
import com.example.data.remote.dtos.animedtos.SingleAnimeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchPagingAnime(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeDto

    @GET("anime/{id}")
    suspend fun fetchDetailsAnime(@Path("id") id: String): SingleAnimeDto
}