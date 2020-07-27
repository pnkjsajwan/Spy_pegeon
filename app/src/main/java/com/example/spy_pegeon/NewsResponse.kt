package com.example.spy_pegeon

import com.example.spy_pegeon.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)