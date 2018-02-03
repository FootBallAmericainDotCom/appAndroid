package com.footballamericain.footballamericain.Activities.Player

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    companion object {
        const val PLAYER_ID = "teamId"
        const val ERROR = -42
    }

    private var playerId: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityPlayerBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_player)
        binding.viewModel = ViewModelProviders.of(this).get(PlayerViewModel::class.java)

        intent?.let {
            playerId = intent.getIntExtra(PLAYER_ID, ERROR)
        }

        if (playerId == null || playerId == ERROR) {
            throw RuntimeException(this.callingPackage + " must implement have an PlayerId")
        }

        binding.viewModel.playerId = playerId
    }
}
