package me.miu.news_data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.miu.news_data.network.NewsApiService
import me.miu.news_data.repo.NewsRepoImpl
import me.miu.news_domain.repo.NewsRepository
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {


    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewsApiService {
        return retrofit.create(NewsApiService::class.java)
    }


    @Provides
    fun provideNewsRepository(newsApiService: NewsApiService): NewsRepository {
        return NewsRepoImpl(newsApiService)
    }

}