package com.footballamericain.footballamericain.Fragments.Scores


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.MatchRecyclerViewAdapter
import com.footballamericain.footballamericain.databinding.FragmentScoresBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent


/**
 * A simple [Fragment] subclass.
 */
class ScoresFragment : Fragment() {

    private val adapter = MatchRecyclerViewAdapter(MatchRecyclerViewAdapter.TYPE.FULL)

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentScoresBinding.inflate(inflater, container, false)

        adapter.mScoreList = MatchDummyContent.ITEMS
        binding.recyclerView.adapter = adapter

        return binding.root
    }

}// Required empty public constructor