package com.footballamericain.footballamericain.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.PagerFragmentAdapter
import com.footballamericain.footballamericain.Fragments.ConferenceRanking.ConferenceRankingFragment
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.FragmentRankingBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [RankingFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [RankingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RankingFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRankingBinding.inflate(inflater, container, false)

        val adapter = getAdapter()
        binding.viewPager.adapter = adapter

        binding.tabLayout?.setupWithViewPager(binding.viewPager)

        return binding.root
    }

    private fun getAdapter(): PagerFragmentAdapter {
        val adapter = PagerFragmentAdapter(childFragmentManager)

        adapter.addFragment(
                ConferenceRankingFragment.newInstance(ConferenceRankingFragment.CONFERENCE.AFC),
                getString(R.string.title_afc),
                R.drawable.ic_american_football_conference
        )
        adapter.addFragment(
                ConferenceRankingFragment.newInstance(ConferenceRankingFragment.CONFERENCE.NFC),
                getString(R.string.title_nfc),
                R.drawable.ic_national_football_conference
        )

        return adapter
    }

}// Required empty public constructor
