package com.footballamericain.footballamericain.Fragments.AllTeams


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.databinding.FragmentRecyclerViewBinding
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.footballamericain.footballamericain.Adapter.TeamsAdapter
import com.footballamericain.footballamericain.Repository.TeamsRepository


/**
 * A simple [Fragment] subclass.
 */
class AllTeamsFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)
        binding.recyclerView.adapter = TeamsAdapter(TeamsRepository.getTeams())

        return binding.root
    }

}// Required empty public constructor
