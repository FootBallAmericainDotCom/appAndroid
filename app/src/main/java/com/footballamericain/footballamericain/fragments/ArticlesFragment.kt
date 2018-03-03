package com.footballamericain.footballamericain.fragments

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

    private var id: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.apply {
            id = getString(ID)

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)

        if (id == null) {
            binding.recyclerView.adapter = ArticlesRecyclerViewAdapter(
                    ArticlesRepository.getArticles(), MatchRepository.getMatches())
        } else {
            id?.let {
                binding.recyclerView.adapter = ArticlesRecyclerViewAdapter(
                        ArticlesRepository.getArticlesByTeamID(it),
                        MatchRepository.getMatchesByTeamID(it)
                )
            }
        }

        return binding.root
    }


    companion object {
        private val ID = "ID"

        fun newInstance(id: String?): ArticlesFragment {
            val fragment = ArticlesFragment()
            val args = Bundle()
            args.putString(ID,id)

            fragment.arguments = args
            return fragment
        }
    }
}
