package com.sateeshjh.search_data.mappers

import com.sateeshjh.search_data.model.ArticleDTO
import com.sateeshjh.search_domain.model.Article

fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author ?: "",
        content = this.content ?: "",
        description = this.description ?: "",
        title = this.title ?: "",
        urlToImage = this.urlToImage ?: "",
    )
}