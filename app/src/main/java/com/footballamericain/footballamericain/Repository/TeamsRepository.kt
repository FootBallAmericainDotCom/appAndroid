package com.footballamericain.footballamericain.Repository

import android.graphics.Color
import android.os.Build
import android.view.WindowManager
import com.footballamericain.footballamericain.Activities.Team.TeamActivityViewModel
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

        fun getTeamById(id : Int, model : TeamActivityViewModel){
            val team = TeamDummyContent.TEAMS[id]

            model.logo.set(team.logo)
            model.name.set(team.fullName)
            model.colorPrimary.set(team.colorPrimary)
            model.colorSecondary.set(team.colorSecondary)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                model.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                model.window?.statusBarColor = Color.parseColor(team.colorSecondary)
            }

        }

        fun getTeamById(id: Int) : TeamDummyContent.Team {
            return TeamDummyContent.TEAMS[id]
        }
    }
}