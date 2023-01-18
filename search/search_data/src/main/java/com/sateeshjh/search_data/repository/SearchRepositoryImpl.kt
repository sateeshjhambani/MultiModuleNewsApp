package com.sateeshjh.search_data.repository

import com.sateeshjh.search_data.mappers.toDomainArticle
import com.sateeshjh.search_data.network.SearchApi
import com.sateeshjh.search_domain.model.Article
import com.sateeshjh.search_domain.repository.SearchRepository

class SearchRepositoryImpl(private val searchApi: SearchApi): SearchRepository {

    override suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article> {
        return searchApi.getSearchArticles(map).articles.map {
            it.toDomainArticle()
        }
    }
}