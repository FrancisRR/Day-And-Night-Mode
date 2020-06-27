package com.francis.nightmode

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class AppController : Application() {

    private val TAG by lazy { AppController::class.java.simpleName }

    companion object {
        lateinit var instance: AppController
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}