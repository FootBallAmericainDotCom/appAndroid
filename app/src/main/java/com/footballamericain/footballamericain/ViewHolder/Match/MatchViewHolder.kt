package com.footballamericain.footballamericain.ViewHolder.Match

import android.view.View
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.Custom.match.MatchViewModel
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchViewHolder(val binding: ViewHolderMatchBinding) : SectionedViewHolder(binding.root) {

    fun bind(match: MatchDummyContent.Match, clickListener: View.OnClickListener) {

        val model: MatchViewModel = MatchViewModel(match)
        binding.model = model

        binding.executePendingBindings()
        binding.root.setOnClickListener(clickListener)
    }
}