package com.footballamericain.footballamericain.Activities

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.Adapter.PagerFragmentAdapter
import com.footballamericain.footballamericain.fragments.AllTeams.AllTeamsFragment
import com.footballamericain.footballamericain.fragments.ArticlesFragment
import com.footballamericain.footballamericain.fragments.RankingFragment
import com.footballamericain.footballamericain.fragments.scores.ScoresFragment
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.databinding.ActivityMainBinding
import devlight.io.library.ntb.NavigationTabBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter = getAdapter()
        binding.viewPager.adapter = adapter

        val models = ArrayList<NavigationTabBar.Model>()
        repeat(adapter.count) { position ->
            models.add(NavigationTabBar.Model
                    .Builder(ContextCompat.getDrawable(this, adapter.getPageIcon(position)),
                            ContextCompat.getColor(this, android.R.color.transparent))
                    .title(adapter.getPageTitle(position).toString())
                    .build()
            )
        }

        binding.tabLayout?.models = models
        binding.tabLayout?.setViewPager(binding.viewPager)
    }

    private fun getAdapter(): PagerFragmentAdapter {
        val adapter = PagerFragmentAdapter(supportFragmentManager)

        adapter.addFragment(ArticlesFragment(), getString(R.string.title_news), R.drawable.ic_news)
        adapter.addFragment(RankingFragment(), getString(R.string.title_ranking), R.drawable.ic_ranking)
        adapter.addFragment(AllTeamsFragment(), getString(R.string.title_teams), R.drawable.ic_football_jersey)
        adapter.addFragment(ScoresFragment(), getString(R.string.title_score), R.drawable.ic_score)

        return adapter
    }
}
