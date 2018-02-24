package com.footballamericain.footballamericain.ViewHolder.Player

import android.content.Intent
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.Activities.Player.PlayerActivity
import com.footballamericain.footballamericain.databinding.ViewHolderPlayerBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerViewHolder(val binding: ViewHolderPlayerBinding) : SectionedViewHolder(binding.root) {


    init {
    }

    fun bind(index: Int, player: PlayerDummyContent.Player) {
        val model = PlayerViewModel(player.number, player.name, player.position, index)
        binding.model = model

        binding.root.setOnClickListener {
            changeActivity(player.id)
        }
    }

    fun bind(index: Int, playerName: String) {
        val model = PlayerViewModel((index + 1).toString(), playerName, "", index)
        binding.model = model
    }

    private fun changeActivity(id: Int) {
        val context = binding.root.context.applicationContext
        val intent = Intent(context, PlayerActivity::class.java)
        intent.putExtra(PlayerActivity.PLAYER_ID, id)

        context.startActivity(intent)
    }
}