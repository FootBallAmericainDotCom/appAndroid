package com.footballamericain.footballamericain.Activities.Player

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
import com.footballamericain.footballamericain.Repository.PlayerRepository
import com.footballamericain.footballamericain.dummy.PlayerDummyContent

/**
 * Created by Jc on 27/01/2018.
 */
class PlayerViewModel(application: Application) : AndroidViewModel(application) {

    val picture = ObservableField<String>()
    val name = ObservableField<String>()
    val team = ObservableField<String>()
    val info = ObservableField<String>()
    val birthday = ObservableField<String>()
    val college = ObservableField<String>()
    val draft = ObservableField<String>()
    val experience = ObservableField<String>()

    val colorPrimary = ObservableField<String>()
    val colorSecondary = ObservableField<String>()


    fun launchCall(playerId: Int, callback: OnDataReadyCallback) {
        PlayerRepository.getPlayerById(
                playerId,
                object : PlayerRepository.OnDataReadyCallback {
                    override fun onDataReady(player: PlayerDummyContent.Player) {
                        callback.setDiagonalView(player.team.colorPrimary,
                                player.team.colorSecondary
                        )
                        picture.set(player.picture)
                        name.set(player.name)
                        team.set(player.team.fullName)
                        info.set(String.format("#%s | %s | %sm | %skg",
                                player.number, player.position, player.height, player.weight)
                        )
                        birthday.set("10/06/94")
                        college.set("EPITECH")
                        draft.set("2000 - n°199 (tour 6) par NE")
                        experience.set("18ème saison")

                        colorPrimary.set(player.team.colorPrimary)
                        colorSecondary.set(player.team.colorSecondary)
                    }
                })

    }

    interface OnDataReadyCallback {
        fun setDiagonalView(colorPrimary: String, colorSecondary: String)
    }
}