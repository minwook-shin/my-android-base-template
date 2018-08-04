package io.github.minwookShin.myAndroidBaseTemplate.Adapter

import android.annotation.SuppressLint
import android.databinding.BindingAdapter
import android.widget.TextView

object BindingAdapter {
    @SuppressLint("SetTextI18n")
    @BindingAdapter("text")
    @JvmStatic
    fun setText(view: TextView, text: String) {
        view.text = text
    }
}
