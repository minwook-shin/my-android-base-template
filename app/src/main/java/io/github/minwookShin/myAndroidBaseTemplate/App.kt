package io.github.minwookshin.myandroidbasetemplate

import android.annotation.SuppressLint
import android.app.Application
import io.github.minwookshin.myandroidbasetemplate.Common.AppSharedPreferences

@SuppressLint("Registered")
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