package io.github.minwookShin.myAndroidBaseTemplate.View.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseFragment
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.ViewModel.MainViewModel
import kotlinx.android.synthetic.main.fragment_a.*

class AFragment : BaseFragment(){
    private val viewModel by lazy { ViewModelProviders.of(this).get(MainViewModel::class.java) }

    private val observer = Observer<Int> {
        printCount(it)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_a,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        connectViewModel()
        clickEvent()
    }

    private fun clickEvent(){
        testButton.setOnClickListener {
            viewModel.increment()
        }
    }

    private fun connectViewModel(){
        viewModel.model.Notifier.observe(this,observer)
        lifecycle.addObserver(viewModel)
    }

    private fun printCount(value: Int) {
        test_text.text = value.toString()
    }
}
