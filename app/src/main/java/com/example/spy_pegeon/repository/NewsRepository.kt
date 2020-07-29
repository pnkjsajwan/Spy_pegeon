package com.example.spy_pegeon.repository

import com.example.spy_pegeon.api.RetrofitInstance
import com.example.spy_pegeon.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}