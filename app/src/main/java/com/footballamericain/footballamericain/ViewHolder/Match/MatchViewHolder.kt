package com.footballamericain.footballamericain.ViewHolder.Match

import android.view.View
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.databinding.ViewHolderMatchFullBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchViewHolder(val binding: Any, val root: View) : SectionedViewHolder(root) {

    constructor(binding: ViewHolderMatchBinding) : this(binding, binding.root)
    constructor(binding: ViewHolderMatchFullBinding) : this(binding, binding.root)

    val model: MatchViewModel = MatchViewModel()

    init {
        when (binding) {
            is ViewHolderMatchBinding -> binding.model = model
            is ViewHolderMatchFullBinding -> binding.model = model
        }
    }

    fun bind(match: MatchDummyContent.Match, clickListener: View.OnClickListener) {


        model.teamOne.set(match.teamOne.name)
        model.teamTwo.set(match.teamTwo.name)

        model.scoreOne.set(match.scoreOne)
        model.scoreTwo.set(match.scoreTwo)

        model.imageOne.set(match.teamOne.logo)
        model.imageTwo.set(match.teamTwo.logo)

        root.setOnClickListener(clickListener)
        model.notifyChange()
    }
}