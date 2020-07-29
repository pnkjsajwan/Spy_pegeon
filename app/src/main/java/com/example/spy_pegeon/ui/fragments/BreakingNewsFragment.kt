package com.example.spy_pegeon.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.spy_pegeon.R
import com.example.spy_pegeon.adapters.NewsAdapters
import com.example.spy_pegeon.ui.NewsActivity
import com.example.spy_pegeon.ui.NewsViewModel

class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news){

    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapters

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

    private fun setupRecyclerView(){
        newsAdapter = NewsAdapters()
    }
}