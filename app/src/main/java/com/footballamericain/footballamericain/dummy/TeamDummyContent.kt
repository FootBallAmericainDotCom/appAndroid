package com.footballamericain.footballamericain.dummy

import java.util.*

/**
 * Created by Jc on 06/01/2018.
 */
object TeamDummyContent {
    class Team(val id: String, val fullName: String, val name: String, val code: String, val logo: String)

    val TEAMS: ArrayList<Team> = ArrayList()

    init {
        TEAMS.add(Team("0", "New-York Giant", "Giant", "NYG", "http://www.footballamericain.com/img_equipe/300/nyg.png"))
        TEAMS.add(Team("1", "New Orleans Saints", "Saints", "NO", "http://www.footballamericain.com/img_equipe/300/no.png"))
        TEAMS.add(Team("2", "Dallas Cowboys", "Cowboys", "DAL", "http://www.footballamericain.com/img_equipe/300/dal.png"))
        TEAMS.add(Team("3", "Washington Redskins", "Redskins", "WAS", "http://www.footballamericain.com/img_equipe/300/was.png"))
        TEAMS.add(Team("4", "New England Patriots", "Patriots", "NE", "http://www.footballamericain.com/img_equipe/300/ne.png"))
        TEAMS.add(Team("5", "Buffalo Bills", "Bills", "BUF", "http://www.footballamericain.com/img_equipe/300/buf.png"))
        TEAMS.add(Team("6", "Indianapolis Colts", "Colts", "IND", "http://www.footballamericain.com/img_equipe/300/ind.png"))
        TEAMS.add(Team("7", "Jacksonville Jaguars", "Jaguars", "JAX", "http://www.footballamericain.com/img_equipe/300/jac.png"))
    }

    fun selectTeam(): Team {
        return TEAMS[Math.abs(Random().nextInt(TEAMS.size))]
    }

}
