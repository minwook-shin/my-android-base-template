package io.github.minwookShin.myAndroidBaseTemplate.Adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.chauthai.swipereveallayout.ViewBinderHelper
import io.github.minwookShin.myAndroidBaseTemplate.App
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.databinding.ViewListItemBinding
import org.jetbrains.anko.longToast
import java.util.ArrayList

class RecyclerViewAdapter(context : Context, dataSet: ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    lateinit var itemBinding: ViewListItemBinding

    private var mDataSet = ArrayList<String>()
    private var mInflater: LayoutInflater? = null
    private var mContext: Context? = null
    private val binderHelper = ViewBinderHelper()
    init {
        mContext = context
        mDataSet = dataSet
        mInflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        itemBinding = DataBindingUtil.inflate(layoutInflater, R.layout.view_list_item, p0, false)
        return ViewHolder(itemBinding.root.rootView)
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        val holder: ViewHolder = p0 as ViewHolder

        if (0 <= p1 && p1 < mDataSet.size) {
            val data = mDataSet[p1]

            binderHelper.bind(itemBinding.swipeLayout, data)
            binderHelper.setOpenOnlyOne(true)
            holder.bind(data)
        }
    }

    override fun getItemCount(): Int {
        return mDataSet.size
    }

    private inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: String) {
            itemBinding.bottomWrapper.setOnClickListener {
                App.INSTANCE.longToast("click")
            }
            itemBinding.executePendingBindings()
            itemBinding.text?.set(data)
            itemBinding.enterText.text= data
            itemBinding.enterText2.text = "BindText"

            itemBinding.frontWrapper.setOnClickListener {
                val displayText = "$data clicked"
                Toast.makeText(mContext, displayText, Toast.LENGTH_SHORT).show()
                Log.d("RecyclerAdapter", displayText)
            }
        }
    }

}