package io.github.minwookShin.myAndroidBaseTemplate.Base

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet

open class BaseView: ConstraintLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
    }
}