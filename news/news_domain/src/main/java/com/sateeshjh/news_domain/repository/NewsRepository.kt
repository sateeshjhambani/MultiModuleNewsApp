package com.sateeshjh.news_domain.repository

import com.sateeshjh.news_domain.model.Article

interface NewsRepository {

    suspend fun getNewsArticle(): List<Article>
}