package com.footballamericain.footballamericain.Activities.Team

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.Adapter.PagerFragmentAdapter
import com.footballamericain.footballamericain.Fragments.ArticlesFragment
import com.footballamericain.footballamericain.Fragments.DepthChart.DepthChartFragment
import com.footballamericain.footballamericain.Fragments.Roaster.RoasterFragment
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.Repository.TeamsRepository
import com.footballamericain.footballamericain.databinding.ActivityTeamBinding


class TeamActivity : AppCompatActivity() {

    companion object {
        val TEAM_ID = "teamId"
        val ERROR = -42
    }

    private var teamId: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTeamBinding = DataBindingUtil.setContentView(this, R.layout.activity_team)

        intent?.let {
            teamId = intent.getIntExtra(TEAM_ID, ERROR)
        }

        if (teamId == ERROR) {
            throw RuntimeException(this.callingPackage + " must implement have an Team teamId")
        }

        binding.viewModel = ViewModelProviders.of(this).get(TeamActivityViewModel::class.java)
        binding.viewModel.window = window

        val adapter = getAdapter()
        binding.viewpager.adapter = adapter

        binding.tabLayout?.setupWithViewPager(binding.viewpager)

        teamId?.let {
            TeamsRepository.getTeamById(it.toInt(), binding.viewModel)
        }
    }

    private fun getAdapter(): PagerFragmentAdapter {
        val adapter = PagerFragmentAdapter(supportFragmentManager)

        adapter.addFragment(ArticlesFragment.newInstance(teamId.toString()), getString(R.string.title_club))
        adapter.addFragment(RoasterFragment(), getString(R.string.title_roaster))
        adapter.addFragment(DepthChartFragment(), getString(R.string.title_depthchart))

        return adapter
    }
}
