package me.miu.news_data.mapper

import me.miu.news_data.model.ArticleDTO
import me.miu.news_domain.model.Article

fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author,
        content = this.content,
        description = this.description,
        title = this.title,
        urlToImage = this.urlToImage
    )
}