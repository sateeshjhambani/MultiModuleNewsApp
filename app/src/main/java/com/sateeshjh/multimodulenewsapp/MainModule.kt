package com.sateeshjh.multimodulenewsapp

import android.content.Context
import com.example.common_utils.Navigator
import com.sateeshjh.multimodulenewsapp.navigation.DefaultNavigator
import com.sateeshjh.multimodulenewsapp.room.AppDatabase
import com.sateeshjh.news_data.room.NewsDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Provides
    @Singleton
    fun provideProvider(): Navigator.Provider {
        return DefaultNavigator()
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideNewsDao(appDatabase: AppDatabase): NewsDAO {
        return appDatabase.getNewsDao()
    }
}