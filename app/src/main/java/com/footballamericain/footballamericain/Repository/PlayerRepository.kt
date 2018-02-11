package com.footballamericain.footballamericain.Repository

import android.os.Handler
import com.footballamericain.footballamericain.dummy.PlayerDummyContent
import com.footballamericain.footballamericain.dummy.YearStatDummyContent
import java.util.*

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerRepository {
    companion object {
        fun getPlayerList(id: Int): ArrayList<PlayerDummyContent.Player> {
            return PlayerDummyContent.PLAYERS
        }

        fun getPlayerById(id: Int, onDataReadyCallback: OnDataReadyCallback) {
            val player = PlayerDummyContent.PLAYERS[id]
            player.stat = YearStatDummyContent.getStat(Random().nextInt(10))

            Handler().postDelayed({
                onDataReadyCallback.onDataReady(player)
            }, 2000)
        }

    }

    interface OnDataReadyCallback {
        fun onDataReady(player: PlayerDummyContent.Player)
    }
}