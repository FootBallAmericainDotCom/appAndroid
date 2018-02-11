package com.footballamericain.footballamericain.dummy

/**
 * Created by Jc on 11/02/2018.
 */
object YearStatDummyContent {

    class YearStat(val year: String)

    fun getStat(time: Int): ArrayList<YearStat>? {
        var year = 2015
        val stat = ArrayList<YearStat>()

        if (time == 0) {
            return null
        }

        repeat(time) {
            stat.add(YearStat(year.toString()))
            year++
        }

        return stat
    }
}