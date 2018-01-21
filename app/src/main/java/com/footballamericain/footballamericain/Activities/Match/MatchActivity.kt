package com.footballamericain.footballamericain.Activities.Match

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.footballamericain.footballamericain.R
import com.footballamericain.footballamericain.Repository.MatchRepository
import com.footballamericain.footballamericain.databinding.ActivityMatchBinding


class MatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMatchBinding = DataBindingUtil.setContentView(this, R.layout.activity_match)

        binding.viewModel = ViewModelProviders.of(this).get(MatchActivityViewModel::class.java)

        MatchRepository.getMatchById(78, binding.viewModel, binding.scoreLayout)
    }
}
