package io.github.minwookShin.myAndroidBaseTemplate.View

import android.databinding.DataBindingUtil
import android.os.Bundle
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseActivity
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.ViewModel.MainViewModel
import io.github.minwookShin.myAndroidBaseTemplate.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {

    private val bind by lazy{ DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind
        connectViewModel()
    }

    private fun connectViewModel(){
        bind.model = MainViewModel()
    }
}
