package com.idn.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.newsapp.fragment.AllNewsFragment
import com.idn.newsapp.fragment.Popular
import com.idn.newsapp.fragment.TopFragment

class SectionPagerAdapter (fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> AllNewsFragment()
            1 -> TopFragment()
            2 -> Popular()
            else -> AllNewsFragment()
        }
    }
}