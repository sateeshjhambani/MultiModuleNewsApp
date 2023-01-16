package com.sateeshjh.news_data.repository

import com.sateeshjh.news_data.mapper.toDomainArticle
import com.sateeshjh.news_data.network.NewsApiService
import com.sateeshjh.news_domain.model.Article
import com.sateeshjh.news_domain.repository.NewsRepository

class NewsRepositoryImpl(private val newsApiService: NewsApiService): NewsRepository {

    override suspend fun getNewsArticle(): List<Article> {
        return newsApiService.getNewsArticles().articles.map {
            it.toDomainArticle()
        }
    }
}