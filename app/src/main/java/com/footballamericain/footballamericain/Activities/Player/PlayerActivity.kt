package com.footballamericain.footballamericain.Activities.Player

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.Adapter.PagerFragmentAdapter
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.ActivityPlayerBinding

class PlayerActivity : AppCompatActivity() {

    companion object {
        const val PLAYER_ID = "teamId"
        const val ERROR = -42
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityPlayerBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_player)
        binding.viewModel = ViewModelProviders.of(this).get(PlayerViewModel::class.java)

        var playerId: Int? = null

        intent?.let {
            playerId = intent.getIntExtra(PLAYER_ID, ERROR)
        }

        if (playerId == null || playerId == ERROR) {
            throw RuntimeException(this.callingPackage + " must implement have an PlayerId")
        }
        val adapter = PagerFragmentAdapter(supportFragmentManager)

        playerId?.let {
            binding.viewModel.launchCall(it, object : PlayerViewModel.OnDataReadyCallback {
                override fun setNewStatFragments(fragmentList: List<Fragment>, titleList: List<String>) {

                    fragmentList.forEachIndexed { index, fragment ->
                        adapter.addFragment(fragment, titleList[index])
                    }

                    binding.viewpager.adapter = adapter
                    binding.tabLayout?.setupWithViewPager(binding.viewpager)

                    binding.executePendingBindings()
                }
            })
        }
    }
}
