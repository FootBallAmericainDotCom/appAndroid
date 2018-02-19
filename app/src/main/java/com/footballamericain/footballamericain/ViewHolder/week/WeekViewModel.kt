package com.footballamericain.footballamericain.ViewHolder.week

import android.content.Context
import android.content.Intent
import android.databinding.ObservableField
import android.view.View
import com.footballamericain.footballamericain.Activities.Match.MatchActivity
import com.footballamericain.footballamericain.Custom.match.MatchView
import com.footballamericain.footballamericain.Custom.match.MatchViewModel
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 19/02/2018.
 */
class WeekViewModel(title: String) {

    val title = ObservableField<String>(title)

    fun createView(context: Context, match: MatchDummyContent.Match): View {
        val matchView = MatchView(context)
        matchView.viewModel = MatchViewModel(match)
        matchView.binding.root.setOnClickListener {
            val intent = Intent(context.applicationContext, MatchActivity::class.java)

            intent.putExtra(MatchActivity.MATCH_ID, match.id)
            context.startActivity(intent)
        }

        return matchView
    }
}