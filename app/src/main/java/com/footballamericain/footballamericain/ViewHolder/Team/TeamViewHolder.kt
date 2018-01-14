package com.footballamericain.footballamericain.ViewHolder.Team

import android.support.v7.widget.RecyclerView
import com.footballamericain.footballamericain.databinding.ViewHolderTeamBinding

/**
 * Created by Jc on 14/01/2018.
 */
class TeamViewHolder(binding: ViewHolderTeamBinding) : RecyclerView.ViewHolder(binding.root) {

    val model = TeamViewModel()

    init {
        binding.model = model
    }


    fun bind(logo: String, name: String) {
        model.logo.set(logo)
        model.name.set(name)
    }
}