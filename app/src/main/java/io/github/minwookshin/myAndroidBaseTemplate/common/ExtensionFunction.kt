package io.github.minwookshin.myAndroidBaseTemplate.common

import android.app.Activity
import org.jetbrains.anko.longToast

object ExtensionFunction{
    fun Activity.toast(text : String){
        longToast(text)
    }
}