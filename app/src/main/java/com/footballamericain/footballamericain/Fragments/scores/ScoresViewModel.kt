package com.footballamericain.footballamericain.Fragments.scores

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.footballamericain.footballamericain.Repository.WeekRepository
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 19/02/2018.
 */
class ScoresViewModel(application: Application) : AndroidViewModel(application) {

    val weeksList = MutableLiveData<ArrayList<ArrayList<MatchDummyContent.Match>>>()

    init {
        WeekRepository.getWeekList(object : WeekRepository.OnDataReadyCallback {
            override fun onDataReady(calendar: ArrayList<ArrayList<MatchDummyContent.Match>>) {
                weeksList.value = calendar
            }
        })
    }
}