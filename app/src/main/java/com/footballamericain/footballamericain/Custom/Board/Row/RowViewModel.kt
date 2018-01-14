package com.footballamericain.footballamericain.Custom.Board.Row

import android.databinding.ObservableField
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.dummy.RankingDummyContent

/**
 * Created by Jc on 02/01/2018.
 */
class RowViewModel(position: Int, rank: RankingDummyContent.Rank) {

    val picture = ObservableField<String>(rank.team.logo)
    val team = ObservableField<String>(rank.team.name)
    val win = ObservableField<String>(rank.win)
    val draw = ObservableField<String>(rank.draw)
    val lost = ObservableField<String>(rank.lost)
    val points = ObservableField<String>(rank.points)
    val backgroundColor = ObservableField<Int>(
            when ((position) % 2) {
                1 -> android.R.color.white
                else -> R.color.gray73
            }
    )
}