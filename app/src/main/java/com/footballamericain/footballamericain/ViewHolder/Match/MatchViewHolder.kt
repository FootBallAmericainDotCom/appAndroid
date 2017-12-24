package com.footballamericain.footballamericain.ViewHolder.Match

import android.content.Intent
import android.support.v7.widget.RecyclerView
import com.footballamericain.footballamericain.Activities.Match.MatchActivity
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchViewHolder(val binding: ViewHolderMatchBinding) : RecyclerView.ViewHolder(binding.root) {

    val model: MatchVHModel = MatchVHModel()

    init {
        binding.model = model
    }

    fun bind(teamOne: MatchDummyContent.Team, scoreOne: String,
             teamTwo: MatchDummyContent.Team, scoreTwo: String) {

        model.teamOne = teamOne.logo
        model.scoreOne = scoreOne
        model.teamTwo = teamTwo.logo
        model.scoreTwo = scoreTwo

        binding.root.setOnClickListener({
            binding.root.context.startActivity(
                    Intent(binding.root.context, MatchActivity::class.java)
            )
        })
        model.notifyChange()
    }
}