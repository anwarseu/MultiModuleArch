package me.miu.news_domain.usecase

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import me.miu.common_utils.Resource
import me.miu.news_domain.model.Article
import me.miu.news_domain.repo.NewsRepository

class GetNewsArticleUseCase (private val newsRepository: NewsRepository) {

    operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data=newsRepository.getNewsArticle()))
        }catch (e:Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}