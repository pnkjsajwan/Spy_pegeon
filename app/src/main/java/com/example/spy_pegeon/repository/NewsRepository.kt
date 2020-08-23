package com.example.spy_pegeon.repository

import com.example.spy_pegeon.api.RetrofitInstance
import com.example.spy_pegeon.db.ArticleDatabase
import com.example.spy_pegeon.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDeo().upsert(article)

    fun getSavedNews() = db.getArticleDeo().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDeo().deleteArticle(article)

}