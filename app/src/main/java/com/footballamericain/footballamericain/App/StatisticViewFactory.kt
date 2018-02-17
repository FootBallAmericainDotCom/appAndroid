package com.footballamericain.footballamericain.App

import android.content.Context
import com.footballamericain.footballamericain.Custom.statistic.passe.PasseView
import com.footballamericain.footballamericain.Custom.statistic.passe.PasseViewModel
import com.footballamericain.footballamericain.Custom.statistic.run.RunView
import com.footballamericain.footballamericain.Custom.statistic.run.RunViewModel

/**
 * Created by Jc on 17/02/2018.
 */
class StatisticViewFactory {

    companion object {
        fun createPasseView(context: Context): PasseView {
            val passeView = PasseView(context)
            val viewModel = PasseViewModel()

            passeView.viewModel = viewModel

            return passeView
        }

        fun createRunView(context: Context): RunView {
            val runView = RunView(context)
            val viewModel = RunViewModel()

            runView.viewModel = viewModel

            return runView
        }

    }
}