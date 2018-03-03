package com.footballamericain.footballamericain.fragments.scores


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.WeekAdapter
import com.footballamericain.footballamericain.databinding.FragmentScoresBinding


/**
 * A simple [Fragment] subclass.
 */
class ScoresFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentScoresBinding.inflate(inflater, container, false)

        val viewModel = ViewModelProviders.of(this).get(ScoresViewModel::class.java)
        val adapter = WeekAdapter()
        binding.recyclerView.adapter = adapter

        viewModel.weeksList.observe(this, Observer { it?.let { adapter.replaceList(it) } })

        return binding.root
    }

}// Required empty public constructor
