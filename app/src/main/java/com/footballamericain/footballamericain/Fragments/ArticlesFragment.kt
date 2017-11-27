package com.footballamericain.footballamericain.Fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.ArticlesRecyclerViewAdapter
import com.footballamericain.footballamericain.databinding.FragmentArticlesListBinding
import com.footballamericain.footballamericain.dummy.DummyContent
import com.footballamericain.footballamericain.dummy.DummyContent.Article

/**
 * A fragment representing a list of Items.
 *
 *
 * Activities containing this fragment MUST implement the [OnListFragmentInteractionListener]
 * interface.
 */
/**
 * Mandatory empty constructor for the fragment manager to instantiate the
 * fragment (e.g. upon screen orientation changes).
 */
class ArticlesFragment : Fragment() {
    private var mListener: OnArticlesFragmentInteractionListener? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentArticlesListBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = ArticlesRecyclerViewAdapter(DummyContent.ITEMS, mListener)

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
