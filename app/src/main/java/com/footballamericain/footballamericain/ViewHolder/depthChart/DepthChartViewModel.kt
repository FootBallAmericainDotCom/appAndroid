package com.footballamericain.footballamericain.ViewHolder.depthChart

import android.databinding.ObservableField
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.Player.PlayerViewModel
import com.footballamericain.footballamericain.databinding.ViewHolderPlayerBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 24/02/2018.
 */
class DepthChartViewModel(title: String) {
    val title = ObservableField<String>(title)

    fun createPlayerView(inflater: LayoutInflater?, parent: ViewGroup,
                      player: PlayerDummyContent.Player, viewPosition: Int): View {
        val binding = ViewHolderPlayerBinding.inflate(inflater, parent, false)
        binding.model = PlayerViewModel(player.number, player.name,
                player.position, viewPosition)

        return binding.root
    }
}