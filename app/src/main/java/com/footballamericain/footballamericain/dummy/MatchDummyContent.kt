package com.footballamericain.footballamericain.dummy

import com.footballamericain.footballamericain.dummy.TeamDummyContent.Team
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


    class Match(val id: String, val teamOne: Team, val scoreOne: String,
                val teamTwo: Team, val scoreTwo: String)

    val MATCHS: MutableList<Match> = ArrayList()
    val CALENDAR: ArrayList<ArrayList<Match>> = ArrayList()


    private val COUNT = 10
    private val WEEKS = 6
    private val GAME_PER_WEEk = 4

    init {
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }

        for (i in 1..WEEKS) {
            addWeek()
        }
    }

    private fun addWeek() {
        val list = ArrayList<Match>()

        (1..GAME_PER_WEEk).mapTo(list) { createDummyItem(it) }

        CALENDAR.add(list)
    }

    private fun addItem(item: Match) {
        MATCHS.add(item)
    }

    private fun createDummyItem(position: Int): Match {
        return Match(position.toString(),
                TeamDummyContent.selectTeam(), makeScore(),
                TeamDummyContent.selectTeam(), makeScore()
        )
    }


    private fun makeScore(): String {
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
}