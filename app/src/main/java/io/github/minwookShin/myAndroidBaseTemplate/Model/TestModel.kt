package io.github.minwookShin.myAndroidBaseTemplate.Model

import androidx.lifecycle.MutableLiveData

data class TestModel(
        val Notifier: MutableLiveData<Int> = MutableLiveData()
)