package com.footballamericain.footballamericain.Custom.match

import android.databinding.BaseObservable
import android.databinding.ObservableField
import com.footballamericain.footballamericain.dummy.MatchDummyContent

/**
 * Created by Jc on 29/11/2017.
 */
class MatchViewModel(match : MatchDummyContent.Match) : BaseObservable() {

    val teamOne = ObservableField<String>(match.teamOne.name)
    val teamTwo = ObservableField<String>(match.teamTwo.name)
    val imageOne = ObservableField<String>(match.teamOne.logo)
    val imageTwo = ObservableField<String>(match.teamTwo.logo)
    val scoreOne = ObservableField<String>(match.scoreOne)
    val scoreTwo = ObservableField<String>(match.scoreTwo)
}