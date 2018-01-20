package com.footballamericain.footballamericain.dummy

import java.util.*

/**
 * Created by Jc on 06/01/2018.
 */
object TeamDummyContent {
    class Team(val id: String, val fullName: String, val name: String, val code: String,
               val logo: String, val colorPrimary: String, val colorSecondary: String)

    val TEAMS: ArrayList<Team> = ArrayList()

    init {
        TEAMS.add(Team("0", "New-York Giant", "Giant", "NYG",
                "http://www.footballamericain.com/img_equipe/300/nyg.png",
                "#001E62", "#A6192E"))
        TEAMS.add(Team("1", "New Orleans Saints", "Saints", "NO",
                "http://www.footballamericain.com/img_equipe/300/no.png",
                "#D3BC8D", "#101820"))
        TEAMS.add(Team("2", "Dallas Cowboys", "Cowboys", "DAL",
                "http://www.footballamericain.com/img_equipe/300/dal.png",
                "#041E42", "#869397"))
        TEAMS.add(Team("3", "Washington Redskins", "Redskins", "WAS",
                "http://www.footballamericain.com/img_equipe/300/was.png",
                "#862633", "#FFCD00"))
        TEAMS.add(Team("4", "New England Patriots", "Patriots", "NE",
                "http://www.footballamericain.com/img_equipe/300/ne.png",
                "#0C2340", "#C8102E"))
        TEAMS.add(Team("5", "Buffalo Bills", "Bills", "BUF",
                "http://www.footballamericain.com/img_equipe/300/buf.png",
                "#00338D", "#C8102E"))
        TEAMS.add(Team("6", "Indianapolis Colts", "Colts", "IND",
                "http://www.footballamericain.com/img_equipe/300/ind.png",
                "#003A70", "#FFFFFF"))
        TEAMS.add(Team("7", "Jacksonville Jaguars", "Jaguars", "JAX",
                "http://www.footballamericain.com/img_equipe/300/jac.png",
                "#006778", "#A17925"))
    }

    fun selectTeam(): Team {
        return TEAMS[Math.abs(Random().nextInt(TEAMS.size))]
    }

    fun selectTeam(id : Int): Team {
        return TEAMS[id]
    }

}
