package com.example.data.remote.pagingsources

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.remote.dtos.animedtos.DataDto
import com.example.data.remote.dtos.animedtos.toDomain
import retrofit2.HttpException
import java.io.IOException

class AnimePagingSource(
    private val animeApiService: AnimeApiService
) : PagingSource<Int, DataDto>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, DataDto> {
        val page = params.key ?: 1
        return try {
            val response =
                animeApiService.fetchPagingAnime(params.loadSize, page)
            val nextPage = if (response.links?.next == null) {
                null
            } else
                Uri.parse(response.links.next).getQueryParameter("page[offset]")!!.toInt()
            LoadResult.Page(
                data = response.data,
                null,
                nextKey = nextPage
            )

        } catch (io: IOException) {
            LoadResult.Error(io)
        } catch (http: HttpException) {
            LoadResult.Error(http)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, DataDto>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}