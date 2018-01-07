package com.footballamericain.footballamericain.Fragments.ConferenceRanking


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

    private var mParam1: String? = null
    private lateinit var viewModel: ConferenceRankingViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ConferenceRankingViewModel(context)

        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
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
        private val ARG_PARAM1 = "param1"

        fun newInstance(param1: String): ConferenceRankingFragment {
            val fragment = ConferenceRankingFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
