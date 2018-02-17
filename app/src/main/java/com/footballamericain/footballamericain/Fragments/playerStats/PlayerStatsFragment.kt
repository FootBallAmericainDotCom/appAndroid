package com.footballamericain.footballamericain.Fragments.playerStats

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.PlayerStatsAdapter
import com.footballamericain.footballamericain.databinding.FragmentScoresBinding

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [PlayerStatsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [PlayerStatsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PlayerStatsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = FragmentScoresBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = PlayerStatsAdapter()
        return binding.root
    }
}