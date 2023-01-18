package com.sateeshjh.search_domain.use_cases

import com.example.common_utils.Resource
import com.sateeshjh.search_domain.model.Article
import com.sateeshjh.search_domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetSearchArticleUseCase(private val searchRepository: SearchRepository) {

    operator fun invoke(map: MutableMap<String, String>): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())

        try {
            emit(Resource.Success(searchRepository.getSearchArticles(map)))
        } catch (e: Exception) {
            emit(Resource.Error(e.message.toString()))
        }
    }
}