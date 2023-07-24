package me.miu.news_domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.miu.news_domain.repo.NewsRepository
import me.miu.news_domain.usecase.GetNewsArticleUseCase

@InstallIn(SingletonComponent::class)
@Module
object NewsDomainModule {


    @Provides
    fun provideGetNewsUseCase(newsRepository: NewsRepository):GetNewsArticleUseCase{
        return GetNewsArticleUseCase(newsRepository)
    }


}