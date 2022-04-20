package com.idn.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.newsapp.data.DataNews
import com.idn.newsapp.adapter.NewsAdapter
import com.idn.newsapp.bindingHeadline
import com.idn.newsapp.databinding.FragmentPopularBinding

class Popular : Fragment() {

    private lateinit var binding: FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater, container, false)
        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

        binding.newsHeadline.apply {
            imgHeadline.setImageResource(DataNews.photoHeadline[1])
            tvTitleHeadline.text = DataNews.titleHeadline[1]
            tvDescHeadline.text = DataNews.contentHeadline[1]
            tvDateHeadline.text = DataNews.dateHeadline[1]
            tvAuthorHeadline.text = DataNews.authorHeadline[1]
        }
        bindingHeadline(binding.newsHeadline, 1)
        return binding.root
    }
}

