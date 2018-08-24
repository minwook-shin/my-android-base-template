package io.github.minwookShin.myAndroidBaseTemplate.ViewModel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import io.github.minwookShin.myAndroidBaseTemplate.App
import io.github.minwookShin.myAndroidBaseTemplate.Model.TestModel
import org.jetbrains.anko.longToast


open class MainViewModel : ViewModel(),LifecycleObserver{
    private var count = 0
    val model = TestModel()
    fun increment() {
        model.Notifier.value = ++count
    }

    private fun saveValue(){
        App.prefs.save = count.toString()
    }

    private fun restoreValue(){
        count = App.prefs.save.toString().toInt()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume(){
        saveValue()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause(){
        restoreValue()
    }
}