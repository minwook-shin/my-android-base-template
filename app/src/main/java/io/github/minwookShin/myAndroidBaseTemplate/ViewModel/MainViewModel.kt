package io.github.minwookShin.myAndroidBaseTemplate.ViewModel

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import androidx.lifecycle.ViewModel
import io.github.minwookShin.myAndroidBaseTemplate.Model.TestModel


open class MainViewModel(private var count: Int = 0) : ViewModel(),LifecycleObserver{
    val model = TestModel()
    fun increment() {
        model.Notifier.value = ++count
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume(){
        if (count != 0){
            increment()
        }

    }
}