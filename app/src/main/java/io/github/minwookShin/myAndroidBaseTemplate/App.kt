package io.github.minwookShin.myAndroidBaseTemplate

import android.annotation.SuppressLint
import android.app.Application
import io.github.minwookShin.myAndroidBaseTemplate.Common.AppSharedPreferences

class App : Application(){
    init {
        INSTANCE = this
    }

    override fun onCreate() {
        prefs = AppSharedPreferences(applicationContext)
        super.onCreate()
    }

    companion object {
        lateinit var INSTANCE: App
        lateinit var prefs: AppSharedPreferences
    }
}