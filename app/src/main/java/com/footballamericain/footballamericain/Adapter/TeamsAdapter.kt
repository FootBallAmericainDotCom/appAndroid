package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.Team.TeamViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderTeamBinding
import com.footballamericain.footballamericain.dummy.TeamDummyContent

/**
 * Created by Jc on 14/01/2018.
 */
class TeamsAdapter(private val list: ArrayList<TeamDummyContent.Team>) : RecyclerView.Adapter<TeamViewHolder>() {
    private var mLayoutInflater: LayoutInflater? = null

    override fun onBindViewHolder(holder: TeamViewHolder?, position: Int) {
        holder?.bind(list[position].id.toInt(), list[position].logo, list[position].name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }

        return TeamViewHolder(ViewHolderTeamBinding.inflate(mLayoutInflater, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }
}