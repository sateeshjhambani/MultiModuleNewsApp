package com.sateeshjh.search_domain.repository

import com.sateeshjh.search_domain.model.Article

interface SearchRepository {

    suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article>
}