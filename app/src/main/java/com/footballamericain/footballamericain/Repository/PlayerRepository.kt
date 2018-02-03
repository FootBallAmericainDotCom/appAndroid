package com.footballamericain.footballamericain.Repository

import android.os.Handler
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerRepository {
    companion object {
        fun getPlayerList(id: Int): ArrayList<PlayerDummyContent.Player> {
            return PlayerDummyContent.PLAYERS
        }

        fun getPlayerById(id: Int, onDataReadyCallback: OnDataReadyCallback) {
            Handler().postDelayed({
                onDataReadyCallback.onDataReady(PlayerDummyContent.PLAYERS[id])
            }, 2000)
        }
    }

    interface OnDataReadyCallback {
        fun onDataReady(player: PlayerDummyContent.Player)
    }
}