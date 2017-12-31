package com.footballamericain.footballamericain.ViewHolder.Match

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.Activities.Match.MatchActivity
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.databinding.ViewHolderMatchFullBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchViewHolder(val binding: Any, val root: View) : SectionedViewHolder(root) {

    constructor(binding: ViewHolderMatchBinding) : this(binding, binding.root)
    constructor(binding: ViewHolderMatchFullBinding) : this(binding, binding.root)

    val model: MatchVHModel = MatchVHModel()

    init {
        when (binding) {
            is ViewHolderMatchBinding -> binding.model = model
            is ViewHolderMatchFullBinding -> binding.model = model
        }
    }

    fun bind(teamOne: MatchDummyContent.Team, scoreOne: String,
             teamTwo: MatchDummyContent.Team, scoreTwo: String) {


        model.teamOne.set(teamOne.name)
        model.teamTwo.set(teamTwo.name)

        model.scoreOne.set(scoreOne)
        model.scoreTwo.set(scoreTwo)

        model.imageOne.set(teamOne.logo)
        model.imageTwo.set(teamTwo.logo)

        root.setOnClickListener({
            root.context.startActivity(
                    Intent(root.context, MatchActivity::class.java)
            )
        })
        model.notifyChange()
    }
}