package com.footballamericain.footballamericain.ViewHolder.HorizontalRecyclerView

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.support.v7.widget.RecyclerView
import com.footballamericain.footballamericain.Adapter.MatchRecyclerViewAdapter
import com.footballamericain.footballamericain.databinding.ViewHolderHorizontalRecyclerViewBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class HorizontalRVViewHolder(val binding: ViewHolderHorizontalRecyclerViewBinding)
    : RecyclerView.ViewHolder(binding.root) {

    private val adapter = MatchRecyclerViewAdapter(binding.root.context)

    init {
        binding.recyclerView.adapter = adapter

        binding.recyclerView.layoutManager = LinearLayoutManager(binding.root.context,
                OrientationHelper.HORIZONTAL, false)
    }

    fun bind(list: List<MatchDummyContent.Match>) {
        adapter.mScoreList = list
        adapter.notifyDataSetChanged()
    }
}