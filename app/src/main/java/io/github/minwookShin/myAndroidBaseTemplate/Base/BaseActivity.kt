package io.github.minwookShin.myAndroidBaseTemplate.Base

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity(){
    val TAG = this.javaClass.simpleName!!
}