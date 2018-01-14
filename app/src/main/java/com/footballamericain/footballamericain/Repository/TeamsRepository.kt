package com.footballamericain.footballamericain.Repository

import com.footballamericain.footballamericain.dummy.TeamDummyContent
import java.util.ArrayList

/**
 * Created by Jc on 14/01/2018.
 */
class TeamsRepository {
    companion object {
        fun getTeams(): ArrayList<TeamDummyContent.Team> {
            return TeamDummyContent.TEAMS
        }
    }
}