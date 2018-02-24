package com.footballamericain.footballamericain.ViewHolder.depthChart

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.footballamericain.footballamericain.databinding.ViewHolderDepthChartBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 24/02/2018.
 */
class DepthChartViewHolder(private val binding: ViewHolderDepthChartBinding)
    : RecyclerView.ViewHolder(binding.root) {

    fun bind(title: String, players: ArrayList<PlayerDummyContent.Player>, inflater: LayoutInflater?) {
        val viewModel = DepthChartViewModel(title)

        binding.viewModel = viewModel
        binding.container.removeAllViews()

        players.forEachIndexed { index, player ->
            binding.container.addView(viewModel.createPlayerView(
                    inflater, binding.container,
                    player, index
            ))
        }
    }
}