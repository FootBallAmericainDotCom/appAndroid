package com.footballamericain.footballamericain.Fragments.ConferenceRanking

import android.content.Context
import android.databinding.ObservableField
import com.footballamericain.footballamericain.Custom.Board.Row.RowView
import com.footballamericain.footballamericain.Custom.Board.Row.RowViewModel
import com.footballamericain.footballamericain.Custom.Board.Table.TableView
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.Repository.RankingRepository

/**
 * Created by Jc on 07/01/2018.
 */
class ConferenceRankingViewModel(val context: Context) {
    val ordinate = ObservableField<List<String>>()

    init {
        ordinate.set(context.resources.getStringArray(R.array.AFC).toList())
    }

    fun setRow(table: TableView) {
        RankingRepository.getConference().forEachIndexed({ index, rank ->
            val row = RowView(context)
            row.viewModel = RowViewModel(index, rank)
            table.addRow(row)
        })

    }
}