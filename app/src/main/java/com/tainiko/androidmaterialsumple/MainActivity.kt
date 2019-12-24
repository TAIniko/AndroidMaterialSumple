package com.tainiko.androidmaterialsumple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setOnNavigationItemSelectedListener { item: MenuItem ->
            return@setOnNavigationItemSelectedListener when (item.itemId) {
                R.id.bottomNavigationAlarmMenuId -> {
                    toast("Alarm item click")
                    true
                }
                R.id.bottomNavigationClockMenuId -> {
                    toast("Clock item clicked")
                    true
                }
                R.id.bottomNavigationTimerMenuId -> {
                    toast("Timer item clicked")
                    true
                }
                R.id.bottomNavigationStopWatchMenuId -> {
                    toast("stop-watch item clicked")
                    true
                }
                else -> false
            }
        }
    }
}
