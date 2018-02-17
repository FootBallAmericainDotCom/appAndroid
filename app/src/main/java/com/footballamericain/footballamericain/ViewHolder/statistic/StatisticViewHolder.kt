package com.footballamericain.footballamericain.ViewHolder.statistic

import android.support.v7.widget.RecyclerView
import com.footballamericain.footballamericain.Custom.match.MatchViewModel
import com.footballamericain.footballamericain.databinding.ViewHolderStatisticBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 14/02/2018.
 */
class StatisticViewHolder(val binding: ViewHolderStatisticBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(match : MatchDummyContent.Match) {
        val viewModel = StatisticViewModel()
        val matchViewModel = MatchViewModel(match)

        binding.container.addView(viewModel.createDataView(binding.root.context, "QB"))
        binding.viewModel = matchViewModel
    }
}