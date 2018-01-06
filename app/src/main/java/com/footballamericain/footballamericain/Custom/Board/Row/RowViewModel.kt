package com.footballamericain.footballamericain.Custom.Board.Row

import android.databinding.ObservableField

/**
 * Created by Jc on 02/01/2018.
 */
class RowViewModel {

    val picture = ObservableField<String>()
    val team = ObservableField<String>()
    val win = ObservableField<String>()
    val draw = ObservableField<String>()
    val lost = ObservableField<String>()
    val points = ObservableField<String>()
}