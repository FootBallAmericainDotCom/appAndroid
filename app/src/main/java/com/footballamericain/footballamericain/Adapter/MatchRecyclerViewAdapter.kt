package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.Match.MatchViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchRecyclerViewAdapter() : RecyclerView.Adapter<MatchViewHolder>() {

    var mScoreList: List<MatchDummyContent.Match> = ArrayList()

    private var mLayoutInflater: LayoutInflater? = null

    override fun getItemCount(): Int {
        return mScoreList.size
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        holder.bind(teamOne = mScoreList[position].teamOne,
                scoreOne = mScoreList[position].scoreOne,
                teamTwo = mScoreList[position].teamTwo,
                scoreTwo = mScoreList[position].scoreTwo
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }

        return MatchViewHolder(ViewHolderMatchBinding.inflate(mLayoutInflater, parent, false))
    }
}