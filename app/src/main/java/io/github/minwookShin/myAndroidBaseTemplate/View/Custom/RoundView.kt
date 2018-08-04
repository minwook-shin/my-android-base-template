package io.github.minwookShin.myAndroidBaseTemplate.View.Custom

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.util.AttributeSet
import android.view.LayoutInflater
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseView
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.databinding.ViewRoundBinding

class RoundView : BaseView {

    var bind : ViewRoundBinding
    var text = ObservableField<String>()

    constructor(context: Context?) : super(context)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_round, this, true)
        bind.text = text;
        initEvents()
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_round, this, true)
        bind.text = text;
        initEvents()
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_round, this, true)
        bind.text = text;
        initEvents()
    }

    constructor(context: Context?, text: String?, tag: Any) : super(context)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_round, this, true)
        bind.text = this.text
        this.text.set(text)
        bind.executePendingBindings()
        this.tag = tag
        initEvents()
    }

    private fun initEvents()
    {

    }
}