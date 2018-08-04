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
import io.github.minwookShin.myAndroidBaseTemplate.databinding.DialogRoundBinding
import org.jetbrains.anko.longToast


class RoundDialog(context:Context) : Dialog(context), View.OnClickListener{
    private var bind :DialogRoundBinding = DataBindingUtil.inflate(LayoutInflater.from(App.INSTANCE.applicationContext), R.layout.dialog_round,null,false)


    private var mode :Int = 0
    private var title = ""
    private var msg = ""
    private var listItem = HashMap<String,String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setCanceledOnTouchOutside(false)
        window.setBackgroundDrawable(ColorDrawable())
        window.setDimAmount(0.0f)
        bind.title = this.title
        bind.massage = this.msg
        bind.items = listItem

        setContentView(bind.root)
    }

    class Builder(context: Context){
        private val dialog = RoundDialog(context)

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
        fun setItems(items: HashMap<String,String>): Builder{
            dialog.listItem = items
            return this
        }
        fun show(): RoundDialog {
            dialog.show()
            return dialog
        }
    }

    override fun onClick(p0: View?) {
    }
}