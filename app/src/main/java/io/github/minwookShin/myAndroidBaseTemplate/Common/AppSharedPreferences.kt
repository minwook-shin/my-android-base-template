package io.github.minwookshin.myandroidbasetemplate.Common

import android.content.SharedPreferences
import android.content.Context

class AppSharedPreferences(context: Context){
    private val fileName = "Prefs"
    private val pref: SharedPreferences = context.getSharedPreferences(fileName, 0)
    private val editor = pref.edit()

    var test: String
        get() = pref.getString("", "")
        set(value) = editor.putString("",value).apply()
}