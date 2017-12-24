package com.footballamericain.footballamericain.Activities.Match

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField

/**
 * Created by Jc on 15/12/2017.
 */
class MatchActivityViewModel(application: Application) : AndroidViewModel(application) {

    val teamOne = ObservableField<String>()
    val teamTwo = ObservableField<String>()

    val imageOne = ObservableField<String>()
    val imageTwo = ObservableField<String>()

    val scoreOne = ObservableField<String>()
    val scoreTwo = ObservableField<String>()

    val matchScoreOne = ObservableField<ArrayList<String>>()
    val matchScoreTwo = ObservableField<ArrayList<String>>()

}