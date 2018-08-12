package io.github.minwookShin.myAndroidBaseTemplate.Dialog

import android.app.Dialog
import android.content.Context
import android.databinding.DataBindingUtil
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import io.github.minwookShin.myAndroidBaseTemplate.App
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.databinding.DialogHorizontalBinding
import org.jetbrains.anko.longToast


class HorizontalDialog(context:Context) : Dialog(context), View.OnClickListener{
    private var bind :DialogHorizontalBinding = DataBindingUtil.inflate(LayoutInflater.from(App.INSTANCE.applicationContext), R.layout.dialog_horizontal,null,false)


    private var mode :Int = 0
    private var title = ""
    private var msg = ""
    private var cancel = ""
    private var okay = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setCanceledOnTouchOutside(false)
        window?.setBackgroundDrawable(ColorDrawable())
        window?.setDimAmount(0.0f)
        bind.mode = this.mode
        bind.title = this.title
        bind.massage = this.msg
        bind.cancel = this.cancel
        bind.okay = this.okay

        bind.okayButton.setOnClickListener(this)
        bind.cancelButton.setOnClickListener(this)

        setContentView(bind.root)
    }

    class Builder(context: Context){
        private val dialog = HorizontalDialog(context)

        fun setMode(mode:Int): Builder {

            dialog.mode = mode
            return this
        }
        fun setTitle(text:String): Builder {
            dialog.title = text
            return this
        }
        fun setMassage(text:String): Builder {
            dialog.msg = text
            return this
        }
        fun setOkayButton(text:String): Builder {
            dialog.okay = text
            return this
        }
        fun setCancelButton(text:String): Builder {
            dialog.cancel = text
            return this
        }
        fun show(): HorizontalDialog {
            dialog.show()
            return dialog
        }
    }

    companion object {
        const val MODE_OK = 1
        const val MODE_OK_CANCEL = 2
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.okay_button -> App.INSTANCE.applicationContext.longToast("okay")
            R.id.cancel_button -> this.dismiss()

        }
    }
}