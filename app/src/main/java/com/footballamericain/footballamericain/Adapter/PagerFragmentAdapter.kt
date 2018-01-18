package com.footballamericain.footballamericain.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.footballamericain.footballamericain.R

/**
 * Created by Jc on 14/11/2017.
 */
class PagerFragmentAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val fragmentList: ArrayList<Fragment> = ArrayList()
    private val titleList: ArrayList<String> = ArrayList()
    private val iconList: ArrayList<Int> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return titleList[position]
    }

    fun getPageIcon(position: Int) : Int {
        return iconList[position]
    }

    fun addFragment(fragment: Fragment, title: String, icon: Int) {
        fragmentList.add(fragment)
        titleList.add(title)
        iconList.add(icon)
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        titleList.add(title)
        iconList.add(R.drawable.logo)
    }
}
