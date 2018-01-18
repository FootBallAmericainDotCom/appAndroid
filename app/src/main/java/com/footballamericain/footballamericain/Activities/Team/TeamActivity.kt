package com.footballamericain.footballamericain.Activities.Team

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.Adapter.PagerFragmentAdapter
import com.footballamericain.footballamericain.Fragments.ArticlesFragment
import com.footballamericain.footballamericain.Fragments.DepthChart.DepthChartFragment
import com.footballamericain.footballamericain.Fragments.Roaster.RoasterFragment
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.Repository.TeamsRepository
import com.footballamericain.footballamericain.databinding.ActivityTeamBinding
import android.view.WindowManager
import android.os.Build



class TeamActivity : AppCompatActivity() {

    companion object {
        val TEAM_ID = "TEAM_ID"
        private val NO_ID = -500
    }

    var ID: Int? = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTeamBinding = DataBindingUtil.setContentView(this, R.layout.activity_team)

        binding.viewModel = ViewModelProviders.of(this).get(TeamActivityViewModel::class.java)
        binding.viewModel.window = window

        intent?.let {
            ID = intent.getIntExtra(TEAM_ID, NO_ID)
        }

        val adapter = getAdapter()
        binding.viewpager.adapter = adapter

        binding.tabLayout?.setupWithViewPager(binding.viewpager)

        ID?.let {
            if (ID != NO_ID) {
                TeamsRepository.getTeamById(it, binding.viewModel)
            }
        }
    }

    private fun getAdapter(): PagerFragmentAdapter {
        val adapter = PagerFragmentAdapter(supportFragmentManager)

        adapter.addFragment(ArticlesFragment(), getString(R.string.title_club))
        adapter.addFragment(RoasterFragment(), getString(R.string.title_roaster))
        adapter.addFragment(DepthChartFragment(), getString(R.string.title_depthchart))

        return adapter
    }
}
