package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.week.WeekViewHolder
import com.footballamericain.footballamericain.databinding.ViewholderWeekBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 30/12/2017.
 */
class MatchExpandableAdapter
    : RecyclerView.Adapter<WeekViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null
    private val weekList = ArrayList<ArrayList<MatchDummyContent.Match>>()

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): WeekViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent?.context)
        }

        return WeekViewHolder(ViewholderWeekBinding.inflate(mLayoutInflater, parent, false))
    }

    override fun getItemCount(): Int {
        return weekList.size
    }

    override fun onBindViewHolder(holder: WeekViewHolder?, position: Int) {
        holder?.bind(String.format("Week %d", position), weekList[position])
    }

    fun replaceList(list: ArrayList<ArrayList<MatchDummyContent.Match>>) {
        weekList.clear()
        weekList.addAll(list)

        notifyDataSetChanged()
    }
}