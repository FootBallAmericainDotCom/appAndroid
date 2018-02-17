package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.statistic.StatisticViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderStatisticBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 17/02/2018.
 */
class PlayerStatsAdapter : RecyclerView.Adapter<StatisticViewHolder>() {
    var inflater: LayoutInflater? = null
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): StatisticViewHolder {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent?.context)
        }

        return StatisticViewHolder(ViewHolderStatisticBinding.inflate(inflater, parent, false))
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: StatisticViewHolder?, position: Int) {
        holder?.bind(MatchDummyContent.MATCHS[1])
    }
}