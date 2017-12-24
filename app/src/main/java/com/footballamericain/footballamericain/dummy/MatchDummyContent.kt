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
        teams.add(Team("1", "New-York Giant", "NYG", "http://www.footballamericain.com/images/images/team/100/NYG-logo.jpg"))
        teams.add(Team("2", "New Orleans Saints", "NO", "http://www.footballamericain.com/images/images/team/100/NO-logo.jpg"))
        teams.add(Team("3", "Dallas Cowboys","DAL", "http://www.footballamericain.com/images/images/team/100/DAL-logo.jpg"))
        teams.add(Team("4", "Washington Redskins","WAS", "http://www.footballamericain.com/images/images/team/100/WAS-logo.jpg"))
        teams.add(Team("5", "New England Patriots","NE", "http://www.footballamericain.com/images/images/team/100/NE-logo.jpg"))
        teams.add(Team("6", "Buffalo Bills","BUF", "http://www.footballamericain.com/images/images/team/100/BUF-logo.jpg"))
        teams.add(Team("7", "Indianapolis Colts","IND", "http://www.footballamericain.com/images/images/team/100/IND-logo.jpg"))
        teams.add(Team("8", "Jacksonville Jaguars","JAX", "http://www.footballamericain.com/images/images/team/100/JAX-logo.jpg"))

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

    fun selectTeam(): Team {
        return teams[Math.abs(Random().nextInt(teams.size))]
    }

    fun makeScore(): String {
        return Random().nextInt(70).toString()
    }

    fun makeMatchScore(): ArrayList<String> {
        val array = ArrayList<String>()

        array.add(Random().nextInt(20).toString())
        array.add(Random().nextInt(20).toString())
        array.add(Random().nextInt(20).toString())
        array.add(Random().nextInt(20).toString())

        return array
    }

    /**
     * A dummy item representing a piece of title.
     */
    class Team(val id: String, val name: String, val code: String, val logo: String)

    class Match(val id: String, val teamOne: Team, val scoreOne: String,
                val teamTwo: Team, val scoreTwo: String)
}