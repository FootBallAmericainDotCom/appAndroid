package com.footballamericain.footballamericain.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.footballamericain.footballamericain.Activities.Match.MatchActivity
import com.footballamericain.footballamericain.ViewHolder.Match.MatchViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderMatchBinding
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchRecyclerViewAdapter(val context: Context) : RecyclerView.Adapter<MatchViewHolder>() {

    var mScoreList: List<MatchDummyContent.Match> = ArrayList()

    private var mLayoutInflater: LayoutInflater? = null

    override fun getItemCount(): Int {
        return mScoreList.size
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        holder.bind(mScoreList[position], View.OnClickListener {
            context.startActivity(Intent(context, MatchActivity::class.java))
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent.context)
        }

        return MatchViewHolder(ViewHolderMatchBinding.inflate(mLayoutInflater, parent, false))
    }
}