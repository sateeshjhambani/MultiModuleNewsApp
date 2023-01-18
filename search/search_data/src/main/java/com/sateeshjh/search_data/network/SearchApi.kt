package com.sateeshjh.search_data.network

import com.sateeshjh.search_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface SearchApi {

    @GET("everything")
    suspend fun getSearchArticles(
        @QueryMap map: MutableMap<String, String>
    ): NewsResponse
}