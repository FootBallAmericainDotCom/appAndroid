package com.footballamericain.footballamericain.fragments.ConferenceRanking


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.databinding.FragmentConferenceRankingBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ConferenceRankingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ConferenceRankingFragment : Fragment() {

    enum class CONFERENCE {
        AFC, NFC
    }

    private lateinit var viewModel: ConferenceRankingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.apply {
            context?.let {
                viewModel = when (CONFERENCE.valueOf(getString(ARG_CONFERENCE))) {
                    CONFERENCE.AFC -> ConferenceRankingViewModel(it, CONFERENCE.AFC)
                    CONFERENCE.NFC -> ConferenceRankingViewModel(it, CONFERENCE.NFC)
                }

            }
         //   throw RuntimeException("A Conference must be set, use NewInstance function")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = FragmentConferenceRankingBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel

        viewModel.setRow(binding.north)
        viewModel.setRow(binding.south)
        viewModel.setRow(binding.east)
        viewModel.setRow(binding.west)

        return binding.root
    }

    companion object {
        private const val ARG_CONFERENCE = "conference"

        fun newInstance(conference: CONFERENCE): ConferenceRankingFragment {
            val fragment = ConferenceRankingFragment()
            val args = Bundle()
            args.putString(ARG_CONFERENCE, conference.name)
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
