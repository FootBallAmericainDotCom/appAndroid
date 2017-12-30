package com.footballamericain.footballamericain.ViewHolder.Match

import android.databinding.BaseObservable
import android.databinding.ObservableField

/**
 * Created by Jc on 29/11/2017.
 */
class MatchVHModel : BaseObservable() {

    val teamOne = ObservableField<String>("")
    val teamTwo = ObservableField<String>("")
    val imageOne = ObservableField<String>("")
    val imageTwo = ObservableField<String>("")
    val scoreOne = ObservableField<String>("")
    val scoreTwo = ObservableField<String>("")
}