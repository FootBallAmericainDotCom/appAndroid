package com.footballamericain.footballamericain.Repository

import android.widget.LinearLayout
import com.footballamericain.footballamericain.Activities.Match.MatchActivityViewModel
import com.footballamericain.footballamericain.Custom.ScoreView.ScoreView
import com.footballamericain.footballamericain.Custom.ScoreView.ScoreViewViewModel
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.dummy.MatchDummyContent
import com.footballamericain.footballamericain.dummy.TeamDummyContent

/**
 * Created by Jc on 19/12/2017.
 */
class MatchRepository {

    companion object {
        fun getMatchById(id: Int, model: MatchActivityViewModel, scoreLayout: LinearLayout) {
            val context = scoreLayout.context

            val teamOne = TeamDummyContent.selectTeam()
            model.teamOne.set(teamOne.name)
            model.imageOne.set(teamOne.logo)

            val teamTwo = TeamDummyContent.selectTeam()
            model.teamTwo.set(teamTwo.name)
            model.imageTwo.set(teamTwo.logo)

            val matchScoreOne = MatchDummyContent.makeMatchScore()
            val scoreOne = matchScoreOne[0].toInt() + matchScoreOne[1].toInt() +
                    matchScoreOne[2].toInt() + matchScoreOne[3].toInt()

            model.scoreOne.set(scoreOne.toString())

            val matchScoreTwo = MatchDummyContent.makeMatchScore()
            val scoreTwo = matchScoreTwo[0].toInt() + matchScoreTwo[1].toInt() +
                    matchScoreTwo[2].toInt() + matchScoreTwo[3].toInt()

            model.scoreTwo.set(scoreTwo.toString())

            matchScoreOne.forEachIndexed { index: Int, score: String ->
                val viewModel = ScoreViewViewModel(
                        context.getString(R.string.quart_time_nbr, index + 1),
                        score,
                        matchScoreTwo[index]
                )

                val scoreView = ScoreView(context)
                scoreView.viewModel = viewModel

                scoreLayout.addView(scoreView)
            }
        }

        fun getMatches(): List<MatchDummyContent.Match> {
            return MatchDummyContent.MATCHS
        }

        fun getMatchesByTeamID(teamId: String): List<MatchDummyContent.Match> {
            return MatchDummyContent.getTeamMatch(teamId.toInt())
        }

        fun getCalendar(): ArrayList<ArrayList<MatchDummyContent.Match>> {
            return MatchDummyContent.CALENDAR
        }
    }
}