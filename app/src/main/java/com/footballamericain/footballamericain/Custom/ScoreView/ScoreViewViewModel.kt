package com.footballamericain.footballamericain.Custom.ScoreView

import android.databinding.ObservableField

/**
 * Created by Jc on 21/12/2017.
 */
class ScoreViewViewModel(title : String, scoreOne : String, scoreTwo: String) {

    val title = ObservableField<String>(title)
    val scoreOne = ObservableField<String>(scoreOne)
    val scoreTwo = ObservableField<String>(scoreTwo)
}