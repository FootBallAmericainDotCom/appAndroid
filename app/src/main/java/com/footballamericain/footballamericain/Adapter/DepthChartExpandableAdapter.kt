package com.footballamericain.footballamericain.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.ViewHolder.Header.HeaderViewHolder
import com.footballamericain.footballamericain.ViewHolder.Player.PlayerViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchHeaderBinding
import com.footballamericain.footballamericain.databinding.ViewHolderPlayerBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 25/01/2018.
 */
class DepthChartExpandableAdapter(private val context: Context,
                                  private val sectionList: ArrayList<ArrayList<PlayerDummyContent.Player>>)
    : SectionedRecyclerViewAdapter<SectionedViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null

    override fun getSectionCount(): Int {
        return sectionList.size
    }

    override fun getItemCount(section: Int): Int {
        return sectionList[section].size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): SectionedViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent?.context)
        }

        return when (viewType) {
            VIEW_TYPE_ITEM -> PlayerViewHolder(ViewHolderPlayerBinding.inflate(
                    mLayoutInflater, parent, false))

            VIEW_TYPE_HEADER -> HeaderViewHolder(ViewHolderMatchHeaderBinding.inflate(
                    mLayoutInflater, parent, false))

            else -> {
                PlayerViewHolder(ViewHolderPlayerBinding.inflate(
                        mLayoutInflater, parent, false))
            }
        }
    }

    override fun onBindHeaderViewHolder(holder: SectionedViewHolder?, section: Int, expanded: Boolean) {
        if (holder is HeaderViewHolder) {
            holder.bind(context.getString(R.string.week_number, section),
                    section,
                    this::toggleSectionExpanded,
                    this::isSectionExpanded
            )
        }
    }

    override fun onBindViewHolder(holder: SectionedViewHolder?, section: Int, relativePosition: Int, absolutePosition: Int) {
        if (holder is PlayerViewHolder) {
            holder.bind(relativePosition, sectionList[section][relativePosition].name       )                       
        }
    }

    override fun onBindFooterViewHolder(holder: SectionedViewHolder?, section: Int) {
    }
}