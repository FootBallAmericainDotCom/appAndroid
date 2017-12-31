package com.footballamericain.footballamericain.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.ViewHolder.Match.MatchViewHolder
import com.footballamericain.footballamericain.ViewHolder.MatchHeader.MatchHeaderViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchFullBinding
import com.footballamericain.footballamericain.databinding.ViewHolderMatchHeaderBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 30/12/2017.
 */
class MatchExpandableAdapter(private val sectionList: ArrayList<ArrayList<MatchDummyContent.Match>>)
    : SectionedRecyclerViewAdapter<SectionedViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null

    override fun onBindViewHolder(holder: SectionedViewHolder?, section: Int, relativePosition: Int, absolutePosition: Int) {
        if (holder is MatchViewHolder) {
            val match = sectionList[section][relativePosition]
            holder.bind(match.teamOne, match.scoreOne, match.teamTwo, match.scoreTwo)
        }
    }

    override fun onBindHeaderViewHolder(holder: SectionedViewHolder?, section: Int, expanded: Boolean) {
        if (holder is MatchHeaderViewHolder) {
            holder.bind(String.format("Week %d", section),
                    section,
                    this::toggleSectionExpanded,
                    this::isSectionExpanded
            )
        }
    }

    override fun onBindFooterViewHolder(holder: SectionedViewHolder?, section: Int) {
    }

    override fun getItemCount(section: Int): Int {
        return sectionList[section].size
    }

    override fun getSectionCount(): Int {
        return sectionList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionedViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }

        return when (viewType) {
            VIEW_TYPE_ITEM -> MatchViewHolder(ViewHolderMatchFullBinding.inflate(
                    mLayoutInflater, parent, false))

            VIEW_TYPE_HEADER -> MatchHeaderViewHolder(ViewHolderMatchHeaderBinding.inflate(
                    mLayoutInflater, parent, false))

            else -> {
                MatchViewHolder(ViewHolderMatchFullBinding.inflate(
                        mLayoutInflater, parent, false))
            }
        }
    }
}