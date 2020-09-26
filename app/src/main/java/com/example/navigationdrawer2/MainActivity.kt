package com.example.navigationdrawer2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*

class MainActivity : AppCompatActivity()  {

    lateinit var homeFragment: HomeFragment
    lateinit var workFragment: WorkFragment
    lateinit var schoolFragment: SchoolFragment
    lateinit var timelineFragment: timelineFragment
    lateinit var settingFragment: SettingFragment
    lateinit var logoutFragment: LogoutFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tool_bar)
        val actionBar = supportActionBar
        actionBar?.title = "Navigation Drawer"

        val drawerToggle : ActionBarDrawerToggle = object : ActionBarDrawerToggle(
            this,
            drawerlayout,
            tool_bar,
            (R.string.open_drawer),
            (R.string.close_drawer)
        ){}

        drawerToggle.isDrawerIndicatorEnabled = true
        drawerlayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()


        nav_view.setNavigationItemSelectedListener{

            when(it.itemId){
                R.id.home -> {

                    homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout,homeFragment).
                    setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                    commit()
                    true
                }

                R.id.work -> {
                    workFragment = WorkFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout,workFragment).
                            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                            commit()
                    true
                }

                R.id.school -> {
                    schoolFragment = SchoolFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout,schoolFragment).
                            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                            commit()
                    true
                }

                R.id.timeline -> {
                    timelineFragment = timelineFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout,timelineFragment).
                            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                            commit()
                    true
                }

                R.id.logout -> {
                    logoutFragment =LogoutFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout,logoutFragment).
                            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                            commit()
                    true
                }

                R.id.setting ->{
                    settingFragment = SettingFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout,settingFragment).
                            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                            commit()
                    true
                }
                else -> super.onOptionsItemSelected(it)

            }
            drawerlayout.closeDrawer(GravityCompat.START)
            true

        }

    }

    override fun onBackPressed() {
        if (drawerlayout.isDrawerOpen(GravityCompat.START)){
            drawerlayout.closeDrawer(GravityCompat.START)
        }
        else{
            super.onBackPressed()
        }
    }

}