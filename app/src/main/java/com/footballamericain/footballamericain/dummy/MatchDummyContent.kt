package com.footballamericain.footballamericain.dummy

import java.util.*
import kotlin.collections.ArrayList

/**
 * Helper class for providing sample title for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object MatchDummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<Match> = ArrayList()

    private val teams: ArrayList<Team> = ArrayList()

    private val COUNT = 10

    init {
        // Add some sample items.
        teams.add(Team("1", "NYG", "http://www.footballamericain.com/images/images/team/100/NYG-logo.jpg"))
        teams.add(Team("2", "NO", "http://www.footballamericain.com/images/images/team/100/NO-logo.jpg"))
        teams.add(Team("3", "DAL", "http://www.footballamericain.com/images/images/team/100/DAL-logo.jpg"))
        teams.add(Team("4", "WAS", "http://www.footballamericain.com/images/images/team/100/WAS-logo.jpg"))
        teams.add(Team("5", "NE", "http://www.footballamericain.com/images/images/team/100/NE-logo.jpg"))
        teams.add(Team("6", "BUF", "http://www.footballamericain.com/images/images/team/100/BUF-logo.jpg"))
        teams.add(Team("7", "IND", "http://www.footballamericain.com/images/images/team/100/IND-logo.jpg"))
        teams.add(Team("8", "JAX", "http://www.footballamericain.com/images/images/team/100/JAX-logo.jpg"))

        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: Match) {
        ITEMS.add(item)
    }

    private fun createDummyItem(position: Int): Match {
        return Match(position.toString(), selectTeam(), makeScore(), selectTeam(), makeScore())
    }

    private fun selectTeam(): Team {
        return teams[Math.abs(Random().nextInt(teams.size))]
    }

    private fun makeScore(): String {
        return Random().nextInt(70).toString()
    }

    /**
     * A dummy item representing a piece of title.
     */
    class Team(val id: String, val name: String, val logo: String)

    class Match(val id: String, val teamOne: Team, val scoreOne: String,
                val teamTwo: Team, val scoreTwo: String)
}