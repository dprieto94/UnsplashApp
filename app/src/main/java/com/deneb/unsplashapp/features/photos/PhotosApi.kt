package com.deneb.unsplashapp.features.photos

import com.deneb.unsplashapp.features.photos.model.UnsplashResponse
import com.deneb.unsplashapp.features.photos.model.UnsplashDetailResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface PhotosApi {
    @GET("photos/")
    fun photos(
        @Query("client_id") clientId: String = "tmr_PqBQovlCcGQgjwvPJPiUGqruqDOs-MMgrXrAgSQ",
        @Query("per_page") perPage: Int = 15,
        @Query("page") page: Int
    ): Call<UnsplashResponse>

    @GET("photos/{id}/?client_id=tmr_PqBQovlCcGQgjwvPJPiUGqruqDOs-MMgrXrAgSQ")
    fun detailPhoto(@Path("id")id: String): Call<UnsplashDetailResponse>
}