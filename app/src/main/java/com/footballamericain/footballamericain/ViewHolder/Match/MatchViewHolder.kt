package com.footballamericain.footballamericain.ViewHolder.Match

import android.databinding.ViewDataBinding
import android.view.View
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.Custom.match.MatchViewModel
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.databinding.ViewHolderMatchFullBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchViewHolder(val binding: ViewDataBinding, val root: View) : SectionedViewHolder(root) {

    constructor(binding: ViewHolderMatchBinding) : this(binding, binding.root)
    constructor(binding: ViewHolderMatchFullBinding) : this(binding, binding.root)

    fun bind(match: MatchDummyContent.Match, clickListener: View.OnClickListener) {

        val model: MatchViewModel = MatchViewModel(match)

        when (binding) {
            is ViewHolderMatchBinding -> binding.model = model
            is ViewHolderMatchFullBinding -> binding.model = model
        }

        binding.executePendingBindings()
        root.setOnClickListener(clickListener)
    }
}