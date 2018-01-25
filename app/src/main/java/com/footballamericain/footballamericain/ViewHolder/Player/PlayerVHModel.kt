package com.footballamericain.footballamericain.ViewHolder.Player

import android.databinding.ObservableField
import com.footballamericain.footballamericain.R

/**
 * Created by Jc on 21/01/2018.
 */
class PlayerVHModel {

    val number = ObservableField<String>()
    val name = ObservableField<String>()
    val position = ObservableField<String>()
    val backgroundColor = ObservableField<Int>()
}