package com.footballamericain.footballamericain.ViewHolder.Player

import android.databinding.ObservableField
import com.footballamericain.footballamericain.R

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerViewModel(number: String, name: String, position: String, viewPosition: Int) {

    val number = ObservableField<String>(number)
    val name = ObservableField<String>(name)
    val position = ObservableField<String>(position)
    val backgroundColor = ObservableField<Int>(
            when (viewPosition % 2) {
                1 -> android.R.color.white
                else -> R.color.gray73
            }
    )
}