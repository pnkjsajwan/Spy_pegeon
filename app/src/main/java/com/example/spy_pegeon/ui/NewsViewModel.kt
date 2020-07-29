package com.example.spy_pegeon.ui

import androidx.lifecycle.ViewModel
import com.example.spy_pegeon.repository.NewsRepository

class NewsViewModel(
    val newRepository: NewsRepository
) : ViewModel() {
}