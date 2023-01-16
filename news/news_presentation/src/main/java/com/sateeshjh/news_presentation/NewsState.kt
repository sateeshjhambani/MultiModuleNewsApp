package com.sateeshjh.news_presentation

import com.sateeshjh.news_domain.model.Article

data class NewsState(
    val isLoading: Boolean = false,
    val error: String = "",
    val data: List<Article>? = null
)