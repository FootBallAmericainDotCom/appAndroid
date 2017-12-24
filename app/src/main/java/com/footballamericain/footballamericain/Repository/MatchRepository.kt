package com.footballamericain.footballamericain.Repository

import com.footballamericain.footballamericain.Activities.Match.MatchActivityViewModel
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 19/12/2017.
 */
class MatchRepository {

    companion object {
        fun getMatchById(id: Int, model: MatchActivityViewModel) {

            val teamOne = MatchDummyContent.selectTeam()
            model.teamOne.set(teamOne.name)
            model.imageOne.set(teamOne.logo)

            val teamTwo = MatchDummyContent.selectTeam()
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

            model.matchScoreOne.set(matchScoreOne)
            model.matchScoreTwo.set(matchScoreTwo)
        }
    }
}