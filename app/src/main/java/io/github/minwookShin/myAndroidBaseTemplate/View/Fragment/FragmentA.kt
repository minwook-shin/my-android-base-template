package io.github.minwookShin.myAndroidBaseTemplate.View.Fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.minwookShin.myAndroidBaseTemplate.Adapter.RecyclerViewAdapter
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseFragment
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.View.Custom.SearchBar
import io.github.minwookShin.myAndroidBaseTemplate.databinding.FragmentABinding
import java.util.ArrayList

class FragmentA : BaseFragment(){
    private var adapter: RecyclerViewAdapter? = null
    lateinit var bind:FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        bind = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)
        return bind.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val userArray = ArrayList<String>()

        userArray.add("사용자 1")
        userArray.add("사용자 2")
        userArray.add("사용자 3")
        userArray.add("사용자 4")
        userArray.add("사용자 5")
        userArray.add("사용자 6")
        userArray.add("사용자 7")


        recyclerView(userArray)


        bind.searchBar.addView(SearchBar(activity?.applicationContext))
    }

    private fun recyclerView(userArray: ArrayList<String>) {
        bind.mRecyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = RecyclerViewAdapter(activity!!.applicationContext, userArray)
        bind.mRecyclerView.adapter = adapter
        bind.mRecyclerView.setHasFixedSize(true)

    }

}
