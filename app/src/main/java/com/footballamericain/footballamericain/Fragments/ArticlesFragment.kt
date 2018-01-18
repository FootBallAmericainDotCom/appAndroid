package com.footballamericain.footballamericain.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.ArticlesRecyclerViewAdapter
import com.footballamericain.footballamericain.Repository.ArticlesRepository
import com.footballamericain.footballamericain.Repository.MatchRepository
import com.footballamericain.footballamericain.databinding.FragmentRecyclerViewBinding

class ArticlesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = ArticlesRecyclerViewAdapter(
                ArticlesRepository.getArticles(), MatchRepository.getMatches())

        return binding.root
    }
}
