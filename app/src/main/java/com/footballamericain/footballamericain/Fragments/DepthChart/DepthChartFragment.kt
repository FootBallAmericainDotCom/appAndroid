package com.footballamericain.footballamericain.Fragments.DepthChart


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.DepthChartExpandableAdapter
import com.footballamericain.footballamericain.Repository.PlayerRepository
import com.footballamericain.footballamericain.Repository.TeamsRepository
import com.footballamericain.footballamericain.databinding.FragmentRecyclerViewBinding


/**
 * A simple [Fragment] subclass.
 * Use the [DepthChartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DepthChartFragment : Fragment() {

    private var teamID: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            teamID = arguments.getInt(ARG_TEAM_ID)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)
        binding.recyclerView.adapter = DepthChartExpandableAdapter(context, TeamsRepository.getDepthChart())

        return binding.root
    }

    companion object {
        private val ARG_TEAM_ID = "TEAM_ID"

        fun newInstance(teamID: Int): DepthChartFragment {
            val fragment = DepthChartFragment()
            val args = Bundle()
            args.putInt(ARG_TEAM_ID, teamID)
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
