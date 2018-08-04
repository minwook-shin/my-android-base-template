package io.github.minwookShin.myAndroidBaseTemplate.Adapter

import android.annotation.SuppressLint
import android.databinding.BindingAdapter
import android.widget.TextView
import com.google.android.flexbox.FlexboxLayout
import io.github.minwookShin.myAndroidBaseTemplate.View.Custom.RoundView

object BindingAdapter {
    @SuppressLint("SetTextI18n")
    @BindingAdapter("text")
    @JvmStatic
    fun setText(view: TextView, text: String) {
        view.text = text
    }

    @BindingAdapter("roundItem")
    @JvmStatic
    fun setFlexRoundItem(view: FlexboxLayout, item: HashMap<String,String>) {
        view.removeAllViews()

        for (it in item.keys){
            view.addView(RoundView(view.context,item[it],it as Any))
        }
    }
}
