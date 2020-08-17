package com.jay.petdogcat.view

import android.os.Bundle
import com.jay.petdogcat.R
import com.jay.petdogcat.adapter.PageAdapter
import com.jay.petdogcat.base.BaseActivity
import com.jay.petdogcat.presenter.MainConstract
import com.jay.petdogcat.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainConstract.View {
    private val TAG = "MainActivity"
    private lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.takeView(this)

        connectAdapter()

    }

    private fun connectAdapter() {
        val adapter = PageAdapter(supportFragmentManager)
        adapter.addItem(FirstFragment())
        adapter.addItem(SecondFragment())
        adapter.addItem(ThirdFragment())
        main_viewPager.adapter = adapter

        main_tabLayout.setupWithViewPager(main_viewPager)
        main_tabLayout.getTabAt(0)!!.text = "Pet"
        main_tabLayout.getTabAt(1)!!.text = "Dog"
        main_tabLayout.getTabAt(2)!!.text = "Cat"
    }

    override fun initPresenter() {
        mPresenter = MainPresenter()
    }

    override fun showLoading() {}

    override fun setPresenter(presenter: MainConstract.Presenter) {}
}