package com.footballamericain.footballamericain.dummy

/**
 * Created by Jc on 21/01/2018.
 */
object PlayerDummyContent {

    class Player(val id: Int, val number: String, val name: String, val position: String)

    val PLAYERS = ArrayList<Player>()

    init {
        PLAYERS.add(Player(0, "6", "Allen Ryan", "P"))
        PLAYERS.add(Player(1, "83", "Allen Dwayne", "TE"))
        PLAYERS.add(Player(2, "80", "Amendola Danny", "WR"))
        PLAYERS.add(Player(3, "60", "Andrews David", "C"))
        PLAYERS.add(Player(4, "29", "Bademosi Johnson", "WR"))
        PLAYERS.add(Player(5, "12", "Brady Tom", "QB"))
        PLAYERS.add(Player(6, "49", "Cardona Joe", "LS"))
        PLAYERS.add(Player(7, "21", "Butler Malcolm", "CB"))
        PLAYERS.add(Player(8, "64", "Kidder Caleb", "DE"))
        PLAYERS.add(Player(9, "68", "Waddle LaAdrian", "OT"))
        PLAYERS.add(Player(10, "19", "Mitchell Malcolm", "WR"))
        PLAYERS.add(Player(11, "47", "Hollister Jacob", "TE"))
    }
}