package com.example.kttablaysoutsample

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter


class FragmentAdapter (fragment:Fragment): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            3 -> Fragment4()
            else -> Fragment1()
        }
    }

}