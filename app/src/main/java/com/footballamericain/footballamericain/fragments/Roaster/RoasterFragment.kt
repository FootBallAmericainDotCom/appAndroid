package com.footballamericain.footballamericain.fragments.Roaster


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Adapter.PlayerAdapter
import com.footballamericain.footballamericain.Repository.PlayerRepository
import com.footballamericain.footballamericain.databinding.FragmentRecyclerViewBinding


/**
 * A simple [Fragment] subclass.
 * Use the [RoasterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RoasterFragment : Fragment() {

    private var teamID: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.apply {
            teamID = getInt(ARG_TEAM_ID)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)
        binding.recyclerView.adapter = PlayerAdapter(PlayerRepository.getPlayerList(5))

        return binding.root
    }

    companion object {
        private val ARG_TEAM_ID = "TEAM_ID"

        fun newInstance(teamID: Int): RoasterFragment {
            val fragment = RoasterFragment()
            val args = Bundle()
            args.putInt(ARG_TEAM_ID, teamID)
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
