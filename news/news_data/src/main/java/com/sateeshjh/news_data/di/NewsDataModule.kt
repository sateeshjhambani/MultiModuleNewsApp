package com.sateeshjh.news_data.di

import com.sateeshjh.news_data.network.NewsApiService
import com.sateeshjh.news_data.repository.NewsRepositoryImpl
import com.sateeshjh.news_data.room.NewsDAO
import com.sateeshjh.news_domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {

    @Provides
    @Singleton
    fun provideNewsApiService(retrofit: Retrofit): NewsApiService {
        return retrofit.create(NewsApiService::class.java)
    }
    @Provides
    @Singleton
    fun provideNewsRepository(newsApiService: NewsApiService, newsDAO: NewsDAO): NewsRepository{
        return NewsRepositoryImpl(newsApiService, newsDAO)
    }
}