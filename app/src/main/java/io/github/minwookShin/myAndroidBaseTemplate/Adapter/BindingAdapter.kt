package io.github.minwookshin.myandroidbasetemplate.Adapter

import android.databinding.BindingAdapter
import android.widget.TextView

object BindingAdapter{
    @BindingAdapter("text")
    @JvmStatic
    fun setText(view : TextView, text :  String){
        view.text = text}
}
