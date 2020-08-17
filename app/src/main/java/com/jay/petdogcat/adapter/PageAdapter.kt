package com.jay.petdogcat.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.jay.petdogcat.presenter.FirstPresenter
import com.jay.petdogcat.presenter.SecondPresenter
import com.jay.petdogcat.presenter.ThirdPresenter
import com.jay.petdogcat.view.FirstFragment
import com.jay.petdogcat.view.SecondFragment
import com.jay.petdogcat.view.ThirdFragment

class PageAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    private var myfg = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                val firstFragment = FirstFragment()
                FirstPresenter(firstFragment)
                firstFragment
            }
            1 -> {
                val secondFragment = SecondFragment()
                SecondPresenter(secondFragment)
                secondFragment
            }
            2-> {
                val thirdFragment = ThirdFragment()
                ThirdPresenter(thirdFragment)
                thirdFragment
            }
            else -> myfg[position]
        }
    }

    override fun getCount(): Int = myfg.size

    fun addItem(fragment : Fragment){
        myfg.add(fragment)
    }
}