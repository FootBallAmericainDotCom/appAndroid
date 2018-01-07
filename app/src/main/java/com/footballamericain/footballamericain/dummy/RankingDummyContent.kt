package com.footballamericain.footballamericain.dummy

import com.footballamericain.footballamericain.dummy.TeamDummyContent.Team
import java.util.*

/**
 * Created by Jc on 07/01/2018.
 */
object RankingDummyContent {
    class Rank(val team: Team, val win: String, val draw: String,
               val lost: String, val points: String)

    val RANKING: MutableList<Rank> = ArrayList()

    init {
        repeat(4) {
            RANKING.add(makeRank())
        }
    }

    private fun makeRank(): Rank {
        return Rank(TeamDummyContent.selectTeam(),
                makeScore(),
                makeScore(),
                makeScore(),
                makePoints()
        )
    }

    private fun makeScore(): String {
        return Random().nextInt(10).toString()
    }

    private fun makePoints(): String {
        return Random().nextInt(100).toString()
    }
}