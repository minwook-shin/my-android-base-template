package io.github.minwookshin.myAndroidBaseTemplate.common

import android.content.SharedPreferences
import android.content.Context

class AppSharedPreferences(context: Context){
    private val fileName = "Prefs"
    private val pref: SharedPreferences = context.getSharedPreferences(fileName, 0)
    private val editor = pref.edit()

    var save: String?
        get()= pref.getString("save", "")
        set(value) = editor.putString("save",value).apply()
}