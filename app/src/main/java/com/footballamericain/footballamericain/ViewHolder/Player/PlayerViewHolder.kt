package com.footballamericain.footballamericain.ViewHolder.Player

import android.content.Intent
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.Activities.Player.PlayerActivity
import com.footballamericain.footballamericain.Activities.Team.TeamActivity
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.ViewHolderPlayerBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerViewHolder(val binding: ViewHolderPlayerBinding) : SectionedViewHolder(binding.root) {

    val model = PlayerVHModel()

    init {
        binding.model = model
    }

    fun bind(index: Int, player: PlayerDummyContent.Player) {
        model.number.set(player.number)
        model.name.set(player.name)
        model.position.set(player.position)
        model.backgroundColor.set(
                when ((index) % 2) {
                    1 -> android.R.color.white
                    else -> R.color.gray73
                }
        )

        binding.root.setOnClickListener {
            changeActivity(player.id)
        }
    }

    fun bind(index: Int, playerName: String) {
        model.number.set((index + 1).toString())
        model.name.set(playerName)
        model.backgroundColor.set(
                when ((index) % 2) {
                    1 -> android.R.color.white
                    else -> R.color.gray73
                }
        )
    }

    private fun changeActivity(id : Int) {
        val context = binding.root.context.applicationContext
        val intent = Intent(context, PlayerActivity::class.java)
        intent.putExtra(PlayerActivity.PLAYER_ID, id)

        context.startActivity(intent)
    }
}