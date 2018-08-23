package io.github.minwookShin.myAndroidBaseTemplate.View

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.github.minwookShin.myAndroidBaseTemplate.Base.BaseActivity
import io.github.minwookShin.myAndroidBaseTemplate.R
import io.github.minwookShin.myAndroidBaseTemplate.View.Fragment.AFragment
import io.github.minwookShin.myAndroidBaseTemplate.View.Fragment.BFragment
import io.github.minwookShin.myAndroidBaseTemplate.View.Fragment.CFragment
import org.jetbrains.anko.longToast


class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.navigation_a ->{
                longToast("A!!")
                val fragmentA = AFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentA).commit()
            }
            R.id.navigation_b -> {
                longToast("B!!")
                val fragmentB = BFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentB).commit()
            }
            R.id.navigation_c -> {
                longToast("C!!")
                val fragmentC = CFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentC).commit()
            }

        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViewModel()
        val fragmentA = AFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container,fragmentA).commit()

        val bottomNavigationView = findViewById<View>(R.id.navigation_view) as BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }
    private fun connectViewModel(){
    }
}



