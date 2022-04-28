package com.example.kttablaysoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kttablaysoutsample.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val tabTitleArray = arrayOf(
        "Tab1",
        "Tab2",
        "Tab3",
        "Tab4"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager = binding.pager
        val tabLayout = binding.tabLayout

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.text = tabTitleArray[position]
        }.attach()
    }
}