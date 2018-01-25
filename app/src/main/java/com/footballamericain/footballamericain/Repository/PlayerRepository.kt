package com.footballamericain.footballamericain.Repository

import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerRepository {
    companion object {
        fun getPlayerList(id : Int): ArrayList<PlayerDummyContent.Player> {
            return PlayerDummyContent.PLAYERS
        }
    }
}