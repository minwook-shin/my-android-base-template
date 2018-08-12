package io.github.minwookShin.myAndroidBaseTemplate.View

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.view.View
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseActivity
import io.github.minwookShin.myAndroidBaseTemplate.Dialog.HorizontalDialog
import io.github.minwookShin.myAndroidBaseTemplate.Dialog.VerticalDialog
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.View.Fragment.FragmentA
import io.github.minwookShin.myAndroidBaseTemplate.View.Fragment.FragmentB
import io.github.minwookShin.myAndroidBaseTemplate.View.Fragment.FragmentC
import io.github.minwookShin.myAndroidBaseTemplate.ViewModel.MainViewModel
import io.github.minwookShin.myAndroidBaseTemplate.databinding.ActivityMainBinding
import org.jetbrains.anko.longToast


class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private val bind by lazy{ DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind
        connectViewModel()
        val fragmentA = FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentA).commit()
        val item = HashMap<String, String>()
        item["T1"] = "팀1"
        item["T2"] = "팀2"
        item["T3"] = "팀3"
        item["T4"] = "팀4"
        setSupportActionBar(bind.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false);
        makeHorizontalDialog()


        val bottomNavigationView = findViewById<View>(R.id.navigation_view) as BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.navigation_a ->{
                longToast("A!!")
                val fragmentA = FragmentA()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentA).commit()
            }
            R.id.navigation_b -> {
                longToast("B!!")
                val fragmentB = FragmentB()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentB).commit()
            }
            R.id.navigation_c -> {
                longToast("C!!")
                val fragmentC = FragmentC()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentC).commit()
            }

        }
        return true
    }

    private fun connectViewModel(){
        bind.model = MainViewModel()
    }

    private fun makeHorizontalDialog(){
        HorizontalDialog.Builder(this)
                .setMode(HorizontalDialog.MODE_OK_CANCEL)
                .setTitle("제목")
                .setMassage("메시지")
                .setOkayButton("예")
                .setCancelButton("아니오")
                .show()
    }
    private fun makeVerticalDialog(){
        VerticalDialog.Builder(this)
                .setMode(HorizontalDialog.MODE_OK_CANCEL)
                .setTitle("제목")
                .setMassage("메시지")
                .setOkayButton("예")
                .setCancelButton("아니오")
                .show()
    }
}
