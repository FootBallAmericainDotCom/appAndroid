package com.footballamericain.footballamericain.Custom.statistic.tackle

import android.databinding.ObservableField

/**
 * Created by Jc on 14/02/2018.
 */
class TackleViewModel {
    val tackleCombo = ObservableField<String>()
    val tackleSolo = ObservableField<String>()
    val tackleAssist = ObservableField<String>()

    val sack = ObservableField<String>()
    val stuff = ObservableField<String>()
    val stuffYards = ObservableField<String>()
}