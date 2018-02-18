package com.footballamericain.footballamericain.Custom.statistic.punt

import android.databinding.ObservableField

/**
 * Created by Jc on 14/02/2018.
 */
class PuntViewModel {
    val punts = ObservableField<String>()
    val puntAverage = ObservableField<String>()
    val length = ObservableField<String>()

    val yards = ObservableField<String>()
    val touchBack = ObservableField<String>()
    val touchBackAverage = ObservableField<String>()

    val twentyYards = ObservableField<String>()
    val averageTwentyYards = ObservableField<String>()
    val revivalTry = ObservableField<String>()

    val yardsRevival = ObservableField<String>()
    val revivalAverage = ObservableField<String>()
    val distanceNet = ObservableField<String>()
}