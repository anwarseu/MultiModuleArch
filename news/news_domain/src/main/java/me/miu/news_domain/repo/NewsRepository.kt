package me.miu.news_domain.repo

import me.miu.news_domain.model.Article

interface NewsRepository {

    suspend fun getNewsArticle():List<Article>

}