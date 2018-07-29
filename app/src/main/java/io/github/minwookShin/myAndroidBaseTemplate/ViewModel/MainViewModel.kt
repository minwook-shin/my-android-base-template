package io.github.minwookShin.myAndroidBaseTemplate.ViewModel

import android.databinding.ObservableField
import io.github.minwookShin.myAndroidBaseTemplate.Model.TestModel


open class MainViewModel{
    private val testText = TestModel()
    open val observableValue = ObservableField<String>(testText.text)

    fun addText(){
        observableValue.set("add text!")
    }
}