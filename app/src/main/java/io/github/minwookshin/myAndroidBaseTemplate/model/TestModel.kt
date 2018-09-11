package io.github.minwookshin.myAndroidBaseTemplate.model

import androidx.lifecycle.MutableLiveData

data class TestModel(
        val Notifier: MutableLiveData<Int> = MutableLiveData()
)