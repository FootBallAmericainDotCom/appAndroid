package com.footballamericain.footballamericain.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.footballamericain.footballamericain.Activities.Match.MatchActivity
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.ViewHolder.Header.HeaderViewHolder
import com.footballamericain.footballamericain.ViewHolder.Match.MatchViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchFullBinding
import com.footballamericain.footballamericain.databinding.ViewHolderMatchHeaderBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 30/12/2017.
 */
class MatchExpandableAdapter(private val context: Context,
                             private val sectionList: ArrayList<ArrayList<MatchDummyContent.Match>>)
    : SectionedRecyclerViewAdapter<SectionedViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null

    override fun getSectionCount(): Int {
        return sectionList.size
    }

    override fun getItemCount(section: Int): Int {
        return sectionList[section].size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionedViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }

        return when (viewType) {
            VIEW_TYPE_ITEM -> MatchViewHolder(ViewHolderMatchFullBinding.inflate(
                    mLayoutInflater, parent, false))

            VIEW_TYPE_HEADER -> HeaderViewHolder(ViewHolderMatchHeaderBinding.inflate(
                    mLayoutInflater, parent, false))

            else -> {
                MatchViewHolder(ViewHolderMatchFullBinding.inflate(
                        mLayoutInflater, parent, false))
            }
        }
    }

    override fun onBindViewHolder(holder: SectionedViewHolder?, section: Int, relativePosition: Int, absolutePosition: Int) {
        if (holder is MatchViewHolder) {
            val match = sectionList[section][relativePosition]
            holder.bind(match, View.OnClickListener {
                context.startActivity(Intent(context, MatchActivity::class.java))
            })
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

    override fun onBindFooterViewHolder(holder: SectionedViewHolder?, section: Int) {
    }
}