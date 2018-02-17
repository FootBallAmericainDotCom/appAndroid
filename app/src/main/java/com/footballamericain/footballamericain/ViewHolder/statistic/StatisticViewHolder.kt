package com.footballamericain.footballamericain.ViewHolder.statistic

import android.support.v7.widget.RecyclerView
import com.footballamericain.footballamericain.databinding.ViewHolderStatisticBinding

/**
 * Created by Jc on 14/02/2018.
 */
class StatisticViewHolder(val binding: ViewHolderStatisticBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind() {
        val viewModel = StatisticViewModel()
        binding.container.addView(viewModel.createDataView(binding.root.context, "QB"))
    }
}