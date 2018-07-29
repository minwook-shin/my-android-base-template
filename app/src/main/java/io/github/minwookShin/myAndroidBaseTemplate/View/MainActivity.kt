package io.github.minwookshin.myandroidbasetemplate.View

import android.databinding.DataBindingUtil
import android.os.Bundle
import io.github.minwookshin.myandroidbasetemplate.Base.BaseActivity
import io.github.minwookshin.myandroidbasetemplate.R
import io.github.minwookshin.myandroidbasetemplate.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {

    private val bind by lazy{ DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind
//        bind.model = TestViewModel()
    }
}
