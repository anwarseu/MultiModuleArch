package me.miu.news_data.repo

import me.miu.news_data.mapper.toDomainArticle
import me.miu.news_data.network.NewsApiService
import me.miu.news_domain.model.Article
import me.miu.news_domain.repo.NewsRepository

class NewsRepoImpl (private val newsApiService: NewsApiService) : NewsRepository {

    override suspend fun getNewsArticle(): List<Article> {
        return newsApiService.getNewsArticles(country = "us").articles.map { it.toDomainArticle() }
    }
}