package com.footballamericain.footballamericain.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.footballamericain.footballamericain.ViewHolder.Player.PlayerViewHolder
import com.footballamericain.footballamericain.databinding.ViewHolderPlayerBinding
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerAdapter(val list: ArrayList<PlayerDummyContent.Player>) : RecyclerView.Adapter<PlayerViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.bind(position, list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PlayerViewHolder {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(parent?.context)
        }

        return PlayerViewHolder(ViewHolderPlayerBinding.inflate(mLayoutInflater, parent, false))
    }
}