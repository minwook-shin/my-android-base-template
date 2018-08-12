package io.github.minwookShin.myAndroidBaseTemplate.View.Custom

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import io.github.minwookShin.myAndroidBaseTemplate.App
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseView
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.databinding.ViewSearchBarBinding
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast

class SearchBar: BaseView, View.OnClickListener {


    var bind : ViewSearchBarBinding
    var text = ObservableField<String>()
    var text2 = ObservableField<String>()


    constructor(context: Context?) : super(context)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_search_bar, this, true)
        initEvents()
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_search_bar, this, true)
        initEvents()
    }
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    {
        bind = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_search_bar, this, true)
        initEvents()
    }

    private fun initEvents()
    {
        bind.edit.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                App.INSTANCE.toast("입력을 마쳤습니다.")

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                App.INSTANCE.toast("변경되었습니다.")
            }
        })
    }
    override fun onClick(v: View) {
    }

}
