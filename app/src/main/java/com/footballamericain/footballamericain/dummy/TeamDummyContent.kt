package com.footballamericain.footballamericain.dummy

import java.util.*

/**
 * Created by Jc on 06/01/2018.
 */
object TeamDummyContent {
    class Team(val id: String, val fullName: String, val name: String, val code: String, val logo: String)

    val TEAMS: ArrayList<Team> = ArrayList()

    init {
        TEAMS.add(Team("1", "New-York Giant", "Giant", "NYG", "http://www.footballamericain.com/images/images/team/100/NYG-logo.jpg"))
        TEAMS.add(Team("2", "New Orleans Saints", "Saints", "NO", "http://www.footballamericain.com/images/images/team/100/NO-logo.jpg"))
        TEAMS.add(Team("3", "Dallas Cowboys", "Cowboys", "DAL", "http://www.footballamericain.com/images/images/team/100/DAL-logo.jpg"))
        TEAMS.add(Team("4", "Washington Redskins", "Redskins", "WAS", "http://www.footballamericain.com/images/images/team/100/WAS-logo.jpg"))
        TEAMS.add(Team("5", "New England Patriots", "Patriots", "NE", "http://www.footballamericain.com/images/images/team/100/NE-logo.jpg"))
        TEAMS.add(Team("6", "Buffalo Bills", "Bills", "BUF", "http://www.footballamericain.com/images/images/team/100/BUF-logo.jpg"))
        TEAMS.add(Team("7", "Indianapolis Colts", "Colts", "IND", "http://www.footballamericain.com/images/images/team/100/IND-logo.jpg"))
        TEAMS.add(Team("8", "Jacksonville Jaguars", "Jaguars", "JAX", "http://www.footballamericain.com/images/images/team/100/JAX-logo.jpg"))
    }

    fun selectTeam(): Team {
        return TEAMS[Math.abs(Random().nextInt(TEAMS.size))]
    }

}
