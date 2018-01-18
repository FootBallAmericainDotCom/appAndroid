package com.footballamericain.footballamericain.Activities.Team

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.databinding.ObservableField
import android.view.Window

/**
 * Created by Jc on 16/01/2018.
 */
class TeamActivityViewModel(application: Application) : AndroidViewModel(application) {

    var window: Window? = null
    val logo = ObservableField<String>()
    val name = ObservableField<String>()
    val colorPrimary = ObservableField<String>()
    val colorSecondary = ObservableField<String>()
}