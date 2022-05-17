package com.example.data.remote

import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.remote.apiservice.AuthenticationApiService
import com.example.data.remote.apiservice.MangaApiService
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Inject

class RetrofitClient @Inject constructor(
    retrofitClient: NetworkFastBuilder,
    okHttp: OkHttp
) {
    private val retrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())
    fun provideAnimeApiService(): AnimeApiService = retrofit.create()
    fun provideMangaApiService(): MangaApiService = retrofit.create()

    class AuthenticationClient @Inject constructor(
        retrofitClient: NetworkFastBuilder,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())

        fun provideAuthenticationApiService(): AuthenticationApiService = retrofit.create()
    }

    private inline fun <reified T : Any> Retrofit.create(): T {
        return create(T::class.java)
    }
}