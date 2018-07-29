package io.github.minwookShin.myAndroidBaseTemplate.ViewModel

import android.databinding.ObservableField
import io.github.minwookShin.myAndroidBaseTemplate.Model.Test


class TestViewModel{
    private val testText = Test()
    val observableValue = ObservableField<String>(testText.text)
    fun addText(){
        observableValue.set("add text!")
    }
}