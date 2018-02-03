package com.footballamericain.footballamericain.dummy

import java.util.*

/**
 * Created by Jc on 21/01/2018.
 */
object PlayerDummyContent {

    class Player(val id: Int, val number: String, val name: String, val position: String,
                 val picture : String, val height: String, val weight : String,
                 val team : TeamDummyContent.Team)

    val PLAYERS = ArrayList<Player>()

    init {
        PLAYERS.add(Player(0, "6", "Allen Ryan", "P",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(1, "83", "Allen Dwayne", "TE",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(2, "80", "Amendola Danny", "WR",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(3, "60", "Andrews David", "C",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(4, "29", "Bademosi Johnson", "WR",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(5, "12", "Brady Tom", "QB",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(6, "49", "Cardona Joe", "LS",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(7, "21", "Butler Malcolm", "CB",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(8, "64", "Kidder Caleb", "DE",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(9, "68", "Waddle LaAdrian", "OT",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(10, "19", "Mitchell Malcolm", "WR",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
        PLAYERS.add(Player(11, "47", "Hollister Jacob", "TE",
                "http://www.footballamericain.com/img_joueur/300/BRADYTOM19770803/tom-brady.png",
                "1,93", "102", TeamDummyContent.TEAMS[4]))
    }

    private fun getDepthChartSection(): ArrayList<PlayerDummyContent.Player> {
        val list = ArrayList<PlayerDummyContent.Player>()

        repeat(3) {
            list.add(PLAYERS[Random().nextInt(PLAYERS.size)])
        }

        return list
    }

    fun getDepthChart(): ArrayList<ArrayList<PlayerDummyContent.Player>> {
        val list = ArrayList<ArrayList<PlayerDummyContent.Player>>()

        repeat(5) {
            list.add(getDepthChartSection())
        }

        return list
    }
}