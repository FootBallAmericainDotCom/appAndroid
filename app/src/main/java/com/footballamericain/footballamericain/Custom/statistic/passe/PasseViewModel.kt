package com.footballamericain.footballamericain.Custom.statistic.passe

import android.databinding.ObservableField

/**
 * Created by Jc on 14/02/2018.
 */
class PasseViewModel {
    val completedPasse = ObservableField<String>()
    val triedPasse = ObservableField<String>()
    val yardGain = ObservableField<String>()

    val percentageCompleted = ObservableField<String>()
    val averageLength = ObservableField<String>()
    val longestPasse = ObservableField<String>()

    val touchDown = ObservableField<String>()
    val interception = ObservableField<String>()
    val qbRating = ObservableField<String>()
}