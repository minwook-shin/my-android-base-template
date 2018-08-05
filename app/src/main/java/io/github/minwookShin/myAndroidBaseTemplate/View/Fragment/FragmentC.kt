package io.github.minwookShin.myAndroidBaseTemplate.View.Fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseFragment
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.databinding.FragmentABinding
import io.github.minwookShin.myAndroidBaseTemplate.databinding.FragmentCBinding

class FragmentC : BaseFragment(){
    lateinit var bind:FragmentCBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_c, container, false)
        return bind.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}