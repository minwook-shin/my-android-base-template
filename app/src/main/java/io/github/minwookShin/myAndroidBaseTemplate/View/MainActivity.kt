package io.github.minwookShin.myAndroidBaseTemplate.View

import android.databinding.DataBindingUtil
import android.os.Bundle
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseActivity
import io.github.minwookShin.myAndroidBaseTemplate.Dialog.HorizontalDialog
import io.github.minwookShin.myAndroidBaseTemplate.Dialog.VerticalDialog
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.ViewModel.MainViewModel
import io.github.minwookShin.myAndroidBaseTemplate.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {

    private val bind by lazy{ DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind
        connectViewModel()
        makeVerticalDialog()
    }

    private fun connectViewModel(){
        bind.model = MainViewModel()
    }

    private fun makeHorizontalDialog(){
        HorizontalDialog.Builder(this)
                .setMode(HorizontalDialog.MODE_OK_CANCEL)
                .setTitle("제목")
                .setMassage("메시지")
                .setOkayButton("예")
                .setCancelButton("아니오")
                .show()
    }
    private fun makeVerticalDialog(){
        VerticalDialog.Builder(this)
                .setMode(HorizontalDialog.MODE_OK_CANCEL)
                .setTitle("제목")
                .setMassage("메시지")
                .setOkayButton("예")
                .setCancelButton("아니오")
                .show()
    }
}
