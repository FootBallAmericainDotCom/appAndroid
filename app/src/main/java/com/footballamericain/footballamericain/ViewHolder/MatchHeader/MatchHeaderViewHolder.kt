package com.footballamericain.footballamericain.ViewHolder.MatchHeader

import android.view.View
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchHeaderBinding

/**
 * Created by Jc on 30/12/2017.
 */
class MatchHeaderViewHolder(val binding: ViewHolderMatchHeaderBinding)
    : SectionedViewHolder(binding.root) {

    val model = MatchHeaderViewModel()

    init {
        binding.viewModel = model
    }


    fun bind(title: String, section: Int, toggle: (Int) -> Unit, isExpanded: (Int) -> Boolean) {
        model.title.set(title)
        model.expanded.set(isExpanded(section))

        binding.root.setOnClickListener({
            toggle(section)
            model.expanded.set(isExpanded(section))
        })
    }
}