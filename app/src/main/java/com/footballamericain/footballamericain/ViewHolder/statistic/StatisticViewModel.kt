package com.footballamericain.footballamericain.ViewHolder.statistic

import android.content.Context
import android.databinding.ObservableField
import android.view.View
import android.widget.LinearLayout
import android.widget.LinearLayout.VERTICAL
import com.footballamericain.footballamericain.App.StatisticViewFactory
import com.footballamericain.footballamericain.Custom.match.MatchViewModel

/**
 * Created by Jc on 14/02/2018.
 */
class StatisticViewModel {

    val matchViewModel = ObservableField<MatchViewModel>()

    fun createDataView(context: Context, position: String): View {
        val linearLayout: LinearLayout = LinearLayout(context)
        linearLayout.orientation = VERTICAL

        when (position) {
            "QB" -> {
                linearLayout.addView(StatisticViewFactory.createPasseView(context))
                linearLayout.addView(StatisticViewFactory.createRunView(context))
            }
        }
        return linearLayout
    }

}