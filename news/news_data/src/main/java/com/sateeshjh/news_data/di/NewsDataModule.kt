package com.sateeshjh.news_data.di

import com.sateeshjh.news_data.network.NewsApiService
import com.sateeshjh.news_data.repository.NewsRepositoryImpl
import com.sateeshjh.news_domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {

    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewsApiService {
        return retrofit.create(NewsApiService::class.java)
    }
    @Provides
    fun provideNewsRepository(newsApiService: NewsApiService): NewsRepository{
        return NewsRepositoryImpl(newsApiService)
    }
}