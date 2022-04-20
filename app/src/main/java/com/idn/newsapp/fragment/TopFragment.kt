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
import com.idn.newsapp.databinding.FragmentTopBinding

class TopFragment : Fragment() {


    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)
        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }

        binding.newsHeadline.apply {
            imgHeadline.setImageResource(DataNews.photoHeadline[2])
            tvTitleHeadline.text = DataNews.titleHeadline[2]
            tvDescHeadline.text = DataNews.contentHeadline[2]
            tvDateHeadline.text = DataNews.dateHeadline[2]
            tvAuthorHeadline.text = DataNews.authorHeadline[2]
        }
        bindingHeadline(binding.newsHeadline, 2)
        return binding.root
    }

}