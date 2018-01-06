package com.footballamericain.footballamericain.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.PagerFragmentAdapter
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.FragmentRankingBinding
import devlight.io.library.ntb.NavigationTabBar

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [RankingFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [RankingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RankingFragment : Fragment() {

    // TODO: Rename and change types of parameters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRankingBinding.inflate(inflater, container, false)

        val adapter = getAdapter()
        binding.viewPager.adapter = adapter

        val models = ArrayList<NavigationTabBar.Model>()
        repeat(adapter.count) { position ->
            models.add(NavigationTabBar.Model
                    .Builder(ContextCompat.getDrawable(context, adapter.getPageIcon(position)),
                            ContextCompat.getColor(context, android.R.color.holo_green_light))
                    .title(adapter.getPageTitle(position).toString())
                    .build()
            )
        }

        binding.tabLayout?.models = models
        binding.tabLayout?.setViewPager(binding.viewPager)

        return binding.root
    }

    private fun getAdapter(): PagerFragmentAdapter {
        val adapter = PagerFragmentAdapter(childFragmentManager)

        adapter.addFragment(ConferenceRankingFragment(), getString(R.string.title_news), R.drawable.ic_american_football_conference)
        adapter.addFragment(ConferenceRankingFragment(), getString(R.string.title_ranking), R.drawable.ic_national_football_conference)

        return adapter
    }

}// Required empty public constructor
