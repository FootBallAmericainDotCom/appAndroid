package com.footballamericain.footballamericain.Custom.statistic.reception

import android.databinding.ObservableField

/**
 * Created by Jc on 14/02/2018.
 */
class ReceptionViewModel {
    val receptionNumber = ObservableField<String>()
    val yardGain = ObservableField<String>()
    val averageLength = ObservableField<String>()

    val longestRun = ObservableField<String>()
    val touchDown = ObservableField<String>()
}