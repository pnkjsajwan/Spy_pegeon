package com.example.spy_pegeon.models

import com.example.spy_pegeon.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)