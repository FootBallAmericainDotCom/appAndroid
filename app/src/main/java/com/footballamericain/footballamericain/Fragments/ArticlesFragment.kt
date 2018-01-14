package com.footballamericain.footballamericain.Fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.ArticlesRecyclerViewAdapter
import com.footballamericain.footballamericain.Repository.ArticlesRepository
import com.footballamericain.footballamericain.Repository.MatchRepository
import com.footballamericain.footballamericain.databinding.FragmentRecyclerViewBinding
import com.footballamericain.footballamericain.dummy.ArticlesDummyContent.Article

class ArticlesFragment : Fragment() {
    private var mListener: OnArticlesFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = ArticlesRecyclerViewAdapter(
                ArticlesRepository.getArticles(), MatchRepository.getMatches(), mListener)

        return binding.root
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnArticlesFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnArticlesFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    interface OnArticlesFragmentInteractionListener {
        fun onArticleInteraction(item: Article)
    }
}
