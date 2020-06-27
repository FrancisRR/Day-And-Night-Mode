package com.francis.nightmode

import android.content.Context
import android.content.SharedPreferences

object Preference {

    lateinit var preferences: SharedPreferences
    private const val UI_MODE = "ui_mode"

    init {
        preferences = AppController.instance.getSharedPreferences("pref", Context.MODE_PRIVATE)
    }


    var UIModeIsDay: Boolean
        get() = preferences.getBoolean(UI_MODE, false)
        set(value) = preferences.edit().putBoolean(UI_MODE, value).apply()


}