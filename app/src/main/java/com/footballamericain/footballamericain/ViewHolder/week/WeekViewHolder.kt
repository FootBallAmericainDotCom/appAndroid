package com.footballamericain.footballamericain.ViewHolder.week

import android.support.v7.widget.RecyclerView
import com.footballamericain.footballamericain.databinding.ViewholderWeekBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 19/02/2018.
 */
class WeekViewHolder(private val binding: ViewholderWeekBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(weekTitle: String, gameList: ArrayList<MatchDummyContent.Match>) {
        val model = WeekViewModel(weekTitle)
        binding.viewModel = model

        gameList.forEach { game ->
            binding.container.addView(model.createView(binding.root.context, game))
        }
    }
}